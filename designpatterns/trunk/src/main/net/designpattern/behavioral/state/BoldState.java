package net.designpattern.behavioral.state;

public class BoldState implements PenState{

	private PenState state;
	
	public void write(String name) {
		System.out.print("<strong>");
		state.write(name);
		System.out.print("</strong>");
	}

	public PenState getState() {
		return state;
	}

	public void setState(PenState state) {
		this.state = state;
	}

}
