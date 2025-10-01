package com.test.pitfalls;

public class DeadlockResolve {
	public static final Object obj1= new Object();
	public static final Object obj2= new Object();
	
	public static void main(String[] args) throws Exception{
		Thread t1= new Thread(() ->
		{
			synchronized(obj1) {
				System.out.println("Thread1 Locked-1");
				
				try {
					
					Thread.sleep(1000);
				}
				catch(Exception e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
				
				synchronized (obj2) {
					System.out.println("Thread1 locked-2");
				}
			}
		});
		
		Thread t2= new Thread(() ->
		{
			synchronized(obj1) {
				System.out.println("Thread2 Locked-1");
				
				try {
					
					Thread.sleep(1000);
				}
				catch(Exception e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
				
				synchronized (obj2) {
					System.out.println("Thread2 locked-2");
				}
			}
		}
				
				
				
				
				);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Deadlock resolve"); // output shown 
	}

}
