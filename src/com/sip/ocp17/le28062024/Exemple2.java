package com.sip.ocp17.le28062024;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemple2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Runnable t = () -> System.out.println("Callable"); // task1; return type est void: get donne null
			Callable<String> c = () -> "OCP17"; // task2

			Callable<Double> cd = () -> Math.random();
			
			
			Future<?> res1 = service.submit(t);
			Future<String> res2 = service.submit(c);
			Future<Double> res3 = service.submit(cd);
			System.out.println(res2.get());
			System.out.println(res1.get());//null
			Thread.sleep(1000);
			System.out.println(res3.isDone()+" "+res3.get()+" "+res3.isCancelled());
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
		
	}

}
