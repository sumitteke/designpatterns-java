/**
 * 
 */
package net.designpattern.creational.abstractfactory;

/**
 * @author sumit
 *
 */
class Factory2 extends AbstractFactory {

	/* (non-Javadoc)
	 * @see net.designpattern.creational.abstractfactory.AbstractFactory#createProduct()
	 */
	@Override
	public AbstractProduct createProduct() {
		return new Product2(25);		
	}

}
