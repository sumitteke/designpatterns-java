package net.designpattern.creational.builder;

public abstract class AbstractBuilder {
	
	protected Product product;
	
	public abstract void setProductName();
	
	public abstract void setProductPrice();

	public Product getProduct() {
		return product;
	}

	public void createNewProduct() {
		System.out.println("Creating product...");
		this.product = new Product();
	}
}
