package net.designpattern.behavioral.command;

import java.util.ArrayList;

public class ConcreteCommand implements Command {

	ArrayList<CommandListener> listeners;
	
	public ConcreteCommand() {
		listeners = new ArrayList<CommandListener>();
	}
	
	public void execute() {
		for(CommandListener listener : listeners){
			listener.executeCommand();
		}

	}
	
	public void addListener(CommandListener listener){
		if(listener != null){
			listeners.add(listener);
		}
	}
	
	public void removeListener(CommandListener listener){
		
	}

}
