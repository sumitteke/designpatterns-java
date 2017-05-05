package net.designpattern.behavioral.state;

public class Italic implements PenState {

	private PenState state;
	
	public void write(String name) {
		System.out.print("<i>");
		state.write(name);
		System.out.print("</i>");
	}

	public PenState getState() {
		return state;
	}

	public void setState(PenState state) {
		this.state = state;
	}
	
}
