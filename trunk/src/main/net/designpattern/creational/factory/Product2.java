package net.designpattern.creational.factory;

class Product2 extends AbstractProduct {

	Product2(float price) {
		setName("Product2");
		setPrice(price);
	}
	
	@Override
	public void useProduct() {
		System.out.println("Using product2.");
	}

}
