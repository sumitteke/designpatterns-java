package net.designpattern.behavioral.command;

public class Client implements CommandListener {

	private ConcreteCommand command;
	
	public Client() {
		command = new ConcreteCommand();
		command.addListener(this);
	}
	
	public void executeCommand() {
		System.out.println("[Client] executeCommand");
	}
	
	public void eventOccured() {
		System.out.println("[Client] eventOccured");
		command.execute();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.eventOccured();
	}

}
