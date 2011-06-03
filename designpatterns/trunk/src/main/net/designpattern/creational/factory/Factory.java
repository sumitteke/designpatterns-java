package net.designpattern.creational.factory;

public class Factory {

	public static AbstractProduct getProduct(String productType) throws IllegalArgumentException{
		if(productType.equals("Product1")){
			return new Product1(10);
		} else if(productType.equals("Product2")) {
			return new Product2(25);
		} else {
			throw new IllegalArgumentException("Product Not found");
		}
	}
}
