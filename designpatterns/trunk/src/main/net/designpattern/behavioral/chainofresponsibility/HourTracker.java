package net.designpattern.behavioral.chainofresponsibility;

public class HourTracker {
	
	private int hours ;
	
	public HourTracker(){
		hours = 0;
	}
	
	public void increment(){
		hours ++;
		if (hours >= 24){
			hours = 0;
		}
	}
	
	public void show() {
		System.out.print(hours + " : ");
	}

}
