package net.designpatterns.layered;

public class TcpIpLayeredModule {
	
	private final Layer physicalLayer, dataLinkLayer, networkLayer;
	
	public TcpIpLayeredModule(){
		this.physicalLayer = new PhysicalLayer();
		this.dataLinkLayer = new DataLinkLayer();
		this.networkLayer = new NetworkLayer();
	}
	
	public void processIncoming() throws Exception {
		physicalLayer.process();
		dataLinkLayer.process();
		networkLayer.process();
	}
	
	public void processOutgoing() throws Exception {
		networkLayer.process();
		dataLinkLayer.process();
		physicalLayer.process();
	}
	
	public static void main(String[] s) throws Exception {
		TcpIpLayeredModule tcp = new TcpIpLayeredModule();
		tcp.processIncoming();
		tcp.processOutgoing();
	}

}
