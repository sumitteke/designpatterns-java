/**
 * 
 */
package net.designpatterns.layered;

/**
 * @author sumit
 *
 */
public class NetworkLayer implements Layer {

	@Override
	public void process() throws Exception {
		System.out.println("[NetworkLayer] inside process");
	}

}
