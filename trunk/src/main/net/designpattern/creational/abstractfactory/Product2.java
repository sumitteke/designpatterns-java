package net.designpattern.creational.abstractfactory;

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
