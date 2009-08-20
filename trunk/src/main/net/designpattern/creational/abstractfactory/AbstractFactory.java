package net.designpattern.creational.abstractfactory;

/**
 * @author sumit
 *
 */
public abstract class AbstractFactory {
	
	public static AbstractFactory getFactory(String productType)throws IllegalArgumentException {
		
		if(productType.equals("Product1")){
			return new Factory1();
		} else if (productType.equals("Product2")){
			return new Factory2();
		} else {
			throw new IllegalArgumentException("Product not found");
		}
	}
	
	public abstract AbstractProduct createProduct();
	
}
