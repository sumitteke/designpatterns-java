package net.designpatterns.asyncronization;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncUsingFuture {

	public static void main(String[] args) throws Exception {
		//with completion service Done in 20secs
		long start = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		//ExecutorService executor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
		CompletionService<String> results = new ExecutorCompletionService<String>(executor);
		for(int i = 0 ; i < 100; i++) {
			Job job = new Job(i);
			results.submit(job);
		}
		for(int i = 0 ; i < 100; i++) {
			System.out.println("completed " + results.take().get());
			Thread.sleep(100);
		}
		executor.shutdown();
		long end = System.currentTimeMillis();
		System.out.println("Done in " + (end - start)/1000 + "secs");
		
		//without completion service Done in 21secs
		/*long start = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0 ; i < 100; i++) {
			Job job = new Job(i);
			Future<String> result = executor.submit(job);
			results.add(result);
		}
		for(int i = 0 ; i < 100; i++) {
			System.out.println("getting result " + results.get(i).get());
			Thread.sleep(100);
		}
		executor.shutdown();
		long end = System.currentTimeMillis();
		System.out.println("Done in " + (end - start)/1000 + "secs");*/
	}
	
	private static class Job implements Callable<String> {
		
		private final int jobNo; 
		
		public Job(int no) {
			this.jobNo = no;
		}

		@Override
		public String call() throws Exception {
			System.out.println("executing job " + jobNo);
			if(jobNo % 3 == 0) {
				Thread.sleep(5000);
			} else {
				Thread.sleep(100);
			}
			
			return "" + jobNo;
		}
	}
}
