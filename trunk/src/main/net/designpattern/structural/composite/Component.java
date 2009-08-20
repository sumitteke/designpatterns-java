package net.designpattern.structural.composite;

public abstract class Component {
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected abstract void print();

}
