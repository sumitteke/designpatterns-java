package net.designpattern.behavioral.state;

public class LowerCaseState implements CaseState {

	@Override
	public void write(String name) {
		System.out.println(name.toLowerCase());
	}

}
