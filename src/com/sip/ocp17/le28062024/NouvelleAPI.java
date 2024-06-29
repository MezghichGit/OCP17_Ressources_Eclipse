package com.sip.ocp17.le28062024;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NouvelleAPI {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Nom du thread : " +Thread.currentThread().getName()); //main
		System.out.println("Begin");
		
		ExecutorService service =null; //ExecutorService : c'est une interface
		
		try {
			// service est un objet basé sur 1 seul thread
			//service = Executors.newSingleThreadExecutor(); // Executors : classe factory
			service = Executors.newFixedThreadPool(2); // service contient actuellement 2 thread
			
			//service = Executors.newCachedThreadPool(); // un nombre de thread selon le besoin 
			
			Runnable task1 = ()->{
				
				System.out.println("Nom du thread : " +Thread.currentThread().getName());
				for(int i =0; i<10; i++) System.out.println("i = "+i);	
				};
			
				
				Runnable task2 = ()->{
				System.out.println("Nom du thread : " +Thread.currentThread().getName());
				for(int j =0; j<10; j++) System.out.println("j = "+j);	
			   };
			service.execute(task1); // il va designer un thread pour exécuter une task
			service.execute(task2);
			
			System.out.println("service.isShutdown() 1: " + service.isShutdown());
			System.out.println("service.isTerminated() 1: " +service.isTerminated());
			
			
			for(int k =0; k<10; k++) System.out.println("k = "+k);	
		}
		finally {
			if(service!=null)
			{
				service.shutdown(); // provoque l'entré dans l'état de shuttingdown
				System.out.println("service.isShutdown() 2: " + service.isShutdown());
				System.out.println("service.isTerminated() 2: " +service.isTerminated());
				Thread.sleep(1000);
			}
		}
		System.out.println("End");
		System.out.println("service.isShutdown() 3: " + service.isShutdown());
		System.out.println("service.isTerminated() 3: " +service.isTerminated());

	}

}
