package com.Java8.Date;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Date_Demo_Java8 {

	public static void main(String[] args) throws InterruptedException {
//		Instant start=Instant.now();
//		System.out.println(start);
//		
//		for (int i = 0; i < 1; i++) {
//			//System.out.println("Hi");
//			Thread.sleep(1000);
//			
//		}
//		
//		Instant end=Instant.now();
//		System.out.println(end);
//		
//		Duration d=Duration.between(start, end);
//		long sec=d.getSeconds();
//		System.out.println(sec);
		
		List<Person> list=new ArrayList<Person>();
		
		try(BufferedReader reader=new BufferedReader(new InputStreamReader(Date_Demo_Java8.class.getResourceAsStream("/com/demo/Date/people.txt")));
			Stream<String> stream=reader.lines();	
				
			)
				
		{
			stream.map(l->{
							String []strs=l.split(" ");
							String name=strs[0].trim();
							int year=Integer.parseInt(strs[1]);
							Month month=Month.of(Integer.parseInt(strs[2]));
							int day=Integer.parseInt(strs[3]);
							Person p=new Person(name,LocalDate.of(year, month, day));
							list.add(p);
							return p;
							}
					
					
					
					).forEach(System.out::println);
		}
		
		catch(Exception e) {
			
		}
		
		LocalDate now=LocalDate.now();
		list.stream().forEach(
								p->{
									Period period=Period.between(p.getDob(), now);
									System.out.println(p.getName()+" was born "+
													period.get(ChronoUnit.YEARS)+" Years and "+
													period.get(ChronoUnit.MONTHS)+" months "+
													"["+p.getDob().until(now, ChronoUnit.MONTHS)+"]"
											);
									
									
								}
							 );
		
	}

}
