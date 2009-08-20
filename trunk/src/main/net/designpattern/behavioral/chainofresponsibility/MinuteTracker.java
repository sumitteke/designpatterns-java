package net.designpattern.behavioral.chainofresponsibility;

public class MinuteTracker {
	
	private int min;
	private HourTracker hourTracker;
	
	public MinuteTracker() {
		min = 0;
		hourTracker = new HourTracker();
	}
	
	public void increment() {
		min++;
		if(min >= 60){
			min = 0;
			hourTracker.increment();
		}
	}
	
	public void show(){
		hourTracker.show();
		System.out.print(min + " : ");
	}

}
