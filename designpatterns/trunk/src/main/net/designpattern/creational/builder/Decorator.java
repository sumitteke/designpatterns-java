package net.designpattern.creational.builder;

public class Decorator {

	public static void createProduct(AbstractBuilder builder) {
		builder.createNewProduct();
		builder.setProductName();
		builder.setProductPrice();
	}
}
