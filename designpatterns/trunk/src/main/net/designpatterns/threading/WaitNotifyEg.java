package net.designpatterns.threading;

public class WaitNotifyEg {

	public static void main(String[] args){
		Observable observable = new Observable();
		observable.start();
		Observer ob = new Observer(observable);
		ob.start();
	}
	
	private static class Observable extends Thread{
		
		private Object sync = new Object();
		
		@Override
		public void run(){
			try {
				System.out.println("waiting for update");
				synchronized (sync) {
					sync.wait();
				}
				sleep(100);
				System.out.println("Doing update");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		public void update(){
			synchronized (sync) {
				sync.notify();
			}
		}
		
	}
	
	private static class Observer extends Thread {
		
		private Observable observable;
		
		public Observer(Observable ob){
			this.observable = ob;
		}
		
		@Override
		public void run(){
			System.out.println("Goin to update");
			this.observable.update();
			System.out.println("Updated");
		}
		
	}
}
