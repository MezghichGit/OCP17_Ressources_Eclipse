package com.sip.ocp17.day12_29062024;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCallableChecked {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			service.submit(()->System.out.println("OCP"));
			
			service.submit(()->{Thread.sleep(1000); return 10;}); //Callable
			service.submit(()->{try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}});
		}
			finally {
				if (service != null) {
					service.shutdown(); // provoque l'entré dans l'état de shuttingdown

				}
			}
	}
	
}
