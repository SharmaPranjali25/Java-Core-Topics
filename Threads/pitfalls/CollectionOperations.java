package com.test.pitfalls;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperations {
	public static void main(String[] args) throws InterruptedException {
	List<Integer> list= new ArrayList<>();
	Thread t1= new Thread(() -> {
		for(int i=0;i<100;i++) {
			list.add(i);		}
	});
	
	Thread t2= new Thread(() -> {
		for(int i=1000;i<2000;i++) {
			list.add(i);		}
	});
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	
	System.out.println("Total Size: "+ list.size());
	
	}

}

//code demonstrates a threading pitfall known as a race condition due to unsafe access
// to a non-thread-safe collection — in this case, ArrayList.
