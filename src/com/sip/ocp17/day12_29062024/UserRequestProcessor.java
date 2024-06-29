package com.sip.ocp17.day12_29062024;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserRequestProcessor {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			// Creating a new cached thread pool
			service = Executors.newCachedThreadPool();
			System.out.println("Server started");

			// Submitting multiple tasks to the executor service
			for (int i = 1; i <= 5; i++) {
				int userId = i;
				// Each task simulates processing a user request
				service.execute(() -> processRequest(userId));
			}

			System.out.println("All requests submitted");
		} finally {
			if (service != null) {
				// Shutting down the executor service
				service.shutdown();
			}
		}
	}

	private static void processRequest(int userId) {
		 System.out.println(Thread.currentThread().getName()+ " Processing request from user " + userId);
		 try { Thread.sleep(2000);
}
		 catch(InterruptedException e) {
			 Thread.currentThread().interrupt();
		 }
		 System.out.println(Thread.currentThread().getName()+ " Finished processing request from user " + userId);

	}
}