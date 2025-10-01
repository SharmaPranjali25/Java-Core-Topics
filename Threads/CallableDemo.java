package com.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTest implements Callable<Integer>{
	private final int num;
	public CallableTest(int num) {
		this.num=num;
	}
	@Override
	public Integer call() throws Exception {
		Thread.sleep(2000);
		return num*num;
	}
}
public class CallableDemo {
	public static void main(String[] args) throws Exception {
		ExecutorService executor= Executors.newFixedThreadPool(3);
		//three threads
		CallableTest t1= new CallableTest(5);
		CallableTest t2= new CallableTest(4);
		CallableTest t3= new CallableTest(7);
		
		Future<Integer> f1= executor.submit(t1);
		Future<Integer> f2= executor.submit(t2);
		Future<Integer> f3= executor.submit(t3);
		
		System.out.println("Task one: "+f1.get());
		System.out.println("Task two: "+ f2.get());
		System.out.println("Task three: "+ f3.get());
		
		executor.shutdown();
		
	}
}
