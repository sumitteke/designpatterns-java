/**
 * 
 */
package net.designpattern.structural.bridge;

/**
 * @author sumit
 *
 */
public class Rectangle extends Shape {

	/* (non-Javadoc)
	 * @see net.designpattern.structural.bridge.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

}
