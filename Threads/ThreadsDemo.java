package com.test.thread;
class Exp1 extends Thread{
	public  void run() {
		System.out.println("run()");
	}
	
	
}

public class ThreadsDemo {
	public static void main(String[] args) {
		Thread t1= new Exp1();
		System.out.println("Before starting thread state: "+t1.getState());
	  System.out.println("Before starting thread status: "+t1.isAlive());
		
		t1.start();
		System.out.println("After starting thread state: "+t1.getState());
		 System.out.println("After starting thread status: "+t1.isAlive());
		
	}
	

}

