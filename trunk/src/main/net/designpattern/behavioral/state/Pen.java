package net.designpattern.behavioral.state;

public class Pen {
	
	private CaseState state;
	
	public Pen(CaseState state) {
		this.state = state;
	}
	
	public void write(String name) {
		state.write(name);
	}
	
	public void changeState(CaseState state) {
		this.state = state;
	}

}
