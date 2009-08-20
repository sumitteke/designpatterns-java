package net.designpattern.creational.factory;

public class Eg {

	public static void main(String[] args) {
		AbstractProduct product1 = Factory.getProduct("Product1");
		product1.useProduct();
		
		AbstractProduct product2 = Factory.getProduct("Product2");
		product2.useProduct();
		
		try {
			AbstractProduct product3 = Factory.getProduct("Product3");
			product3.useProduct();
		} catch (IllegalArgumentException e) {
			System.out.println("Product not found");
		}
	}

}
