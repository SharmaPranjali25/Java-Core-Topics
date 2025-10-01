package com.test.thread;
//thread scheduling with priority
import java.util.Timer;
import java.util.TimerTask;

class TimerTest extends TimerTask{
	private String taskName;
	public TimerTest(String taskName) {
		this.taskName= taskName;
	}
//	@Override
//	public void run() {
//		System.out.println("run() task from timer");
//	}
	@Override
	public void run() {
	    System.out.println("Running task: " + taskName);
	}

	
}

public class TimerDemo {
	public static void main(String[] args) {
		Timer timer= new Timer(); //scheduler that will manage execution
		//one time execution
		timer.schedule(new TimerTest("credit"),2000);
		//repeated times execution
		timer.scheduleAtFixedRate(new TimerTest("Transfer"), 1000, 3000);
		try {
			Thread.sleep(11000); //11sec
		}
		catch(Exception e) {
			Thread.currentThread().interrupt();
			
		}
		timer.cancel();
		System.out.println("Timer cancelled");
	}

}
