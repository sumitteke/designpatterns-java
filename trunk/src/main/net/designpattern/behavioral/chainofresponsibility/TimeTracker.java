package net.designpattern.behavioral.chainofresponsibility;

public class TimeTracker extends Thread{
	
	private SecondTracker secTracker;
	private int trackTime;
	
	public TimeTracker(int trackTime) {
		this.trackTime = trackTime;
		secTracker = new SecondTracker();
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i <= this.trackTime; i++){
			secTracker.show();
			secTracker.increment();
		}
		
	}
	
	public static void main(String[] args) {
		TimeTracker tt = new TimeTracker(10000);
		tt.start();
	}

}
