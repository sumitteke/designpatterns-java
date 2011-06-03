package net.designpatterns.asyncronization;

import java.util.concurrent.ArrayBlockingQueue;

public class AsyncronusResponder extends Thread{
	
	private ArrayBlockingQueue<ResponseHandler> requests = new ArrayBlockingQueue<ResponseHandler>(10);
	
	public void request(ResponseHandler hanlder){
		requests.offer(hanlder);
	}

	@Override
	public void run(){
		while(true){
			try {
				Thread.sleep(2000);
				requests.take().handleReponse();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
