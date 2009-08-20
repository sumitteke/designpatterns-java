package net.designpattern.behavioral.chainofresponsibility;

public class SecondTracker {
	
	private int seconds;
	private MinuteTracker minTracker;
	
	public SecondTracker() {
		seconds = 0;
		minTracker = new MinuteTracker();
	}
	
	public void increment() {
		seconds++;
		if(seconds >= 60) {
			minTracker.increment();
			seconds = 0;
		}
	}
	
	public void show() {
		minTracker.show();
		System.out.println(seconds);
	}

}
