package net.designpattern.creational.builder;

public class Builder1 extends AbstractBuilder {

	@Override
	public void setProductName() {
		System.out.println("Setting name : Product1");
		this.product.setName("Product1");
	}

	@Override
	public void setProductPrice() {
		System.out.println("Setting price : 10");
		this.product.setPrice(10);
	}

}
