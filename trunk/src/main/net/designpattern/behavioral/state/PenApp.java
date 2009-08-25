package net.designpattern.behavioral.state;

public class PenApp {

	public static void main(String[] args){
		LowerCaseState lstate = new LowerCaseState();
		UpperCaseState ustate = new UpperCaseState();
		Pen p = new Pen(lstate);
		p.write("sumit");
		p.changeState(ustate);
		p.write("sumit");
		p.changeState(lstate);
		p.write("sumit");
		p.changeState(ustate);
		p.write("sumit");
	}
}
