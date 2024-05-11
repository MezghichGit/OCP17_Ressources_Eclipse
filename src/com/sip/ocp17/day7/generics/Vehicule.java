package com.sip.ocp17.day7.generics;

public interface Vehicule <T> {
	
	public default void addToVehicule(T element)
	{
		System.out.println( element + " added");
	}
	
	
	public void display(T t);

}
