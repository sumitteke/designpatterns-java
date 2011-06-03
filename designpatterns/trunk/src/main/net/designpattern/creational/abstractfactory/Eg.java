package net.designpattern.creational.abstractfactory;

public class Eg {

	public static void main(String[] args) {
		AbstractFactory factory1 = AbstractFactory.getFactory("Product1");
		AbstractProduct product1 = factory1.createProduct();
		product1.useProduct();

		AbstractFactory factory2 = AbstractFactory.getFactory("Product2");
		AbstractProduct product2 = factory2.createProduct();
		product2.useProduct();
		
		try {
			AbstractFactory factory3 = AbstractFactory.getFactory("Product3");
			AbstractProduct product3 = factory3.createProduct();
			product2.useProduct();
		} catch (IllegalArgumentException e) {
			System.out.println("Product not found");
		}
	}

}
