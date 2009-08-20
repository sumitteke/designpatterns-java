package net.designpattern.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public abstract class AbstractProduct {
	
	private String name;
	private float price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return this.price;
	}

	public abstract void useProduct();
}
