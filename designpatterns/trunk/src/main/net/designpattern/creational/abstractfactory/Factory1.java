/**
 * 
 */
package net.designpattern.creational.abstractfactory;

/**
 * @author sumit
 *
 */
class Factory1 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new Product1(10);
	}

}
