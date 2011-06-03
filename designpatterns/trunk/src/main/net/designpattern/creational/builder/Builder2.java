package net.designpattern.creational.builder;

public class Builder2 extends AbstractBuilder {

	@Override
	public void setProductName() {
		System.out.println("Setting name : Product2");
		this.product.setName("Product2");
	}

	@Override
	public void setProductPrice() {
		System.out.println("Setting price : 25");
		this.product.setPrice(25);
	}

}
