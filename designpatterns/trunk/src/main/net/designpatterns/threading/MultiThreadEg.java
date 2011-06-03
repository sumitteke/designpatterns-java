package net.designpatterns.threading;

public class MultiThreadEg extends Thread{
	
	public MultiThreadEg(String name){
		super(name);
	}
	
	/**
	 * This is same as doing synchronized(this){ }
	 * 		Instance level locking eg.
	 * @throws InterruptedException
	 */
	public synchronized void instanceMethodSyncTest() throws InterruptedException{
		System.out.println("inside instance method > " + this.getName());
		sleep(2000);
		System.out.println("end of instance method > " + this.getName());
	}
	
	/**
	 * This is same as doing synchronized(MultiThread.class){ }
	 * 		Class level locking eg.
	 * @throws InterruptedException
	 */
	public static synchronized void staticMethodSyncTest() throws InterruptedException{
		System.out.println("inside static method > " + Thread.currentThread().getName());
		sleep(2000);
		System.out.println("end of static method > " + Thread.currentThread().getName());
	}
	
	@Override
	public void run(){
		try {
			instanceMethodSyncTest();
			staticMethodSyncTest();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		MultiThreadEg t1 = new MultiThreadEg("thread1");
		MultiThreadEg t2 = new MultiThreadEg("thread2");
		t1.start();
		t2.start();
	}

}
