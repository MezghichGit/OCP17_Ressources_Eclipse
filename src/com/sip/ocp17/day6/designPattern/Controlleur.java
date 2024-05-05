package com.sip.ocp17.day6.designPattern;

//Un exemple de classe Singleton
public class Controlleur {

	private static Controlleur instance = null;

	private Controlleur() {
		System.out.println("Controlleur is created");
	}

	//public static Controlleur getInstance() {  // Not Thread Safe! :(
	public synchronized static Controlleur getInstance() {  // Thread Safe :)
		if (instance == null) {
			instance = new Controlleur();
		}

		return instance;
	}

}
