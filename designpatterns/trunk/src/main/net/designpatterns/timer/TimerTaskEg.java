package net.designpatterns.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskEg {

	private static class TimeoutHandler extends TimerTask {
		@Override
		public void run() {
			System.out.println("do task");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		System.out.println("adding timer task");
		t.schedule(new TimeoutHandler(), 10000);
		Thread.sleep(11000);
		//t.cancel();
	}

}
