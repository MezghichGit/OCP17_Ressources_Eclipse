package com.sip.ocp17.day8.methodesReferences;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class QCM {

	public static void main(String[] args) {
		/*
		Number x = 10; 
		Integer y = 12;
		
		x = y; // upcasting
		List<?> list = List.of("Mouse","Parrot"); // Unbownded type sont immutable
		var v = List.of("Mouse","Parrot"); // méthode of retourne un type immutable
		
		//list.removeIf(String::isEmpty);
		
		//list.removeIf(s -> s.length() == 4);
		
		v.removeIf(String::isEmpty);
		v.removeIf(s -> s.length() == 4);*/
		
		var numbers = new HashSet<Number>();
		numbers.add( Integer.valueOf( 86 ) );
		numbers.add(75);
		numbers.add( Integer.valueOf( 86 ) );
		numbers.add( null);
		numbers.add( 309L );
		Iterator iter = numbers.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}

}
