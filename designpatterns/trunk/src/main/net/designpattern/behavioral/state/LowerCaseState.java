package net.designpattern.behavioral.state;

public class LowerCaseState implements PenState {

	public void write(String name) {
		System.out.print(name.toLowerCase());
	}

}
