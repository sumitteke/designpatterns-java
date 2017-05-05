package net.designpattern.behavioral.state;

public class UpperCaseState implements PenState {

	public void write(String name) {
		System.out.print(name.toUpperCase());
	}

}
