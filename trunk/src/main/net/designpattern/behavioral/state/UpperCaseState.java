package net.designpattern.behavioral.state;

public class UpperCaseState implements CaseState {

	@Override
	public void write(String name) {
		System.out.println(name.toUpperCase());
	}

}
