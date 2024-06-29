package com.sip.ocp17.day12_29062024;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();

			Callable<Double> v = () -> {
				Thread.sleep(1000);
				return Math.random();
			};
			
			Runnable r = () -> {
				//Thread.sleep(1000);
				 System.out.println(Math.random());
			};
			Future<Double> result = service.submit(v);
			Future<?> result2 = service.submit(r);
			 System.out.println(result.get());
			 System.out.println(result2.get());
			//System.out.println(result.get(2, TimeUnit.NANOSECONDS));

		}/* catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		finally {
			if (service != null) {
				service.shutdown(); // provoque l'entré dans l'état de shuttingdown

			}
		}

	}

}
