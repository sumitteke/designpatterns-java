/**
 * 
 */
package net.designpatterns.layered;

/**
 * @author sumit
 *
 */
public class PhysicalLayer implements Layer {

	@Override
	public void process() throws Exception {
		System.out.println("[PhysicalLayer] inside process");
	}

}
