package net.designpattern.behavioral.state;

public class Pen {
	
	private PenState state;
	
	public Pen(PenState state) {
		this.state = state;
	}
	
	public void write(String name) {
		state.write(name);
		System.out.println("");
	}
	
	public void changeState(PenState state) {
		this.state = state;
	}

}
