package net.designpatterns.asyncronization;

public class Requester {
	
	public static void main(String[] args) throws InterruptedException{
		ResposeHandlerImpl handler = new ResposeHandlerImpl();
		AsyncronusResponder responder = new AsyncronusResponder();
		responder.start();
		responder.request(handler);
		System.out.println("Requested");
		handler.getResponse();
		System.out.println("got response");
	}
	
	private static class ResposeHandlerImpl implements ResponseHandler{
		
		private final Object mutex = new Object();
		
		@Override
		public void handleReponse() {
			synchronized (mutex) {
				mutex.notify();
			}
		}
		
		public void getResponse() throws InterruptedException{
			synchronized (mutex) {
				mutex.wait();
			}
		}
	}

}
