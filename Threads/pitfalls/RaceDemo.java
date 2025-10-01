package com.test.pitfalls;

public class RaceDemo {
	public static int count=0;
	public static void main(String[] args) throws Exception {
		//runnable interface object and convert it to thread class
		Thread t1= new Thread(() ->
		{
			System.out.println("run() thread 1: "+count);
			for(int i=0;i<5000;i++) {
				count++;
			}
		});
		
		Thread t2= new Thread(() ->
		{
			System.out.println("run() thread 2: "+count);
			for(int i=0;i<5000;i++) {
				count++;
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("The final count value in main method- "+count);
				
				
				
		
	}

}
