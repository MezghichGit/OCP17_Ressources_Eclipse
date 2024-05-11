package com.sip.ocp17.day7.generics;

public class Voiture <T> implements Vehicule<T> {

	@Override
	public void display(T t) {
	System.out.println(t);
		
	}

}
