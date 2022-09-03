package com.Java8.lambda;

/**
 * Hello world!
 *
 */
public class Runnable_Demo {
	public static void main(String[] args) throws InterruptedException {
//		Runnable r=new Runnable() {
//			public void run() {
//				
//				for(int i=0;i<5;i++) {
//					System.out.println("Hello World from Thread ["+Thread.currentThread().getName()+"]");
//				}
//				
//			}
//		};
		
		Runnable r=()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hello World from Thread ["+Thread.currentThread().getName()+"]");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		t.join();
	}
}