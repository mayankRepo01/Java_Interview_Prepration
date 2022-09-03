package com.Java8.stream.FileDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream_File_Demo {

	public static void main(String[] args) throws IOException {
		
		List<Person> Persons=new ArrayList<Person>();
		
		try (BufferedReader br=new BufferedReader(new InputStreamReader(Stream_File_Demo.class.getResourceAsStream("/com/demo/stream/FileDemo/Persons.txt")));
			Stream<String> StreamOfLines=br.lines();
				
			)
		{
			
			
			StreamOfLines.map(line->{
								String s[]=line.split(" ");
								Person p=new Person(s[0],Integer.parseInt(s[1]));
							
								Persons.add(p);
								return p;
									}
			                 ).forEach(System.out::println);
			
		}
		catch (Exception e) {
		
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Stream<Person>s=Persons.stream();
		Optional<Person> op=s.filter(p->p.getAge()>20).min(Comparator.comparing(Person::getAge));
		System.out.println(op);

	}

}
