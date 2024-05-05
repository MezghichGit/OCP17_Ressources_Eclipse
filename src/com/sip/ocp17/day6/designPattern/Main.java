package com.sip.ocp17.day6.designPattern;

public class Main {

	public static void main(String[] args) {
		//Controlleur c1 = Controlleur.getInstance();
		
		//Controlleur c2 = Controlleur.getInstance();
		
		//System.out.println(c1.toString());
		//Syste'm.out.println(c2.toString());
		
		Runnable task1 = ()->{
			Controlleur c1 = Controlleur.getInstance();
			System.out.println(Thread.currentThread().getName());
			System.out.println(c1.toString());
			
		}; // création d'un instance controlleur
		Runnable task2 = ()->{
			Controlleur c2 = Controlleur.getInstance();
			System.out.println(Thread.currentThread().getName());
			System.out.println(c2.toString());
			
		};  // création d'un instance controlleur
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		
 
	}

}
