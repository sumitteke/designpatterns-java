package net.designpattern.creational.abstractfactory;

class Product1 extends AbstractProduct {

	Product1(float price) {
		setName("Product1");
		setPrice(price);
	}
	
	@Override
	public void useProduct() {
		System.out.println("Using product1.");
	}

}
