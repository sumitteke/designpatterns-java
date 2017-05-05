package net.designpattern.behavioral.state;

public class PenApp {

	public static void main(String[] args) {
		
		LowerCaseState lstate = new LowerCaseState();
		UpperCaseState ustate = new UpperCaseState();
		
		Pen p = new Pen(lstate);
		p.write("sumit");
		
		p.changeState(ustate);
		p.write("sumit");
		
		BoldState boldState = new BoldState();
		boldState.setState(ustate);
		p.changeState(boldState);
		p.write("sumit");
		
		Italic italicState = new Italic();
		italicState.setState(boldState);
		p.changeState(italicState);
		p.write("sumit");
		
		p.changeState(ustate);
		p.write("sumit");
	}
}
