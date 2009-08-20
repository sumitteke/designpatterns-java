package net.designpatterns.layered;

/**
 * 
 * @author sumit
 *
 */
public class DataLinkLayer implements Layer{

	@Override
	public void process() throws Exception {
		System.out.println("[DataLinkLayer] inside process");
	}

}
