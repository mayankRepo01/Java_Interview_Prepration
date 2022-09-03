package com.Java8.lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * Hello world!
 *
 */
public class FirstLambda 
{
    public static void main( String[] args )
    {
//        FileFilter ff=new FileFilter() {
//			
//			public boolean accept(File pathname) {
//				return pathname.getName().endsWith(".java");
//			}
//		};
//		
    	//This is a filter to filterfiles
    	FileFilter ff=(File f1)->f1.getName().endsWith(".java");
		
    	///This is just to fetch the directory
		File dir=new File("c:/java");
		
		//this will have all the files that get passed through that filter
		File[] files=dir.listFiles(ff);
		
		for(File f:files) {
			System.out.println(f);
		}
}
}