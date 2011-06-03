package net.designpattern.creational.builder;

public class Eg {

	public static void main(String[] args) {
		Builder1 builder1 = new Builder1();
		Builder2 builder2 = new Builder2();
		
		Decorator.createProduct(builder1);
		Decorator.createProduct(builder2);

	}

}
