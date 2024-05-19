package com.sip.ocp17.day8.methodesReferences;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Platypus {

	// public class Platypus implements Comparator<String>{

	String name;
	int beakLength;

	public int getBeakLength() {
		return beakLength;
	}

	public void setBeakLength(int beakLength) {
		this.beakLength = beakLength;
	}

	public Platypus(String name, int beakLength) {
		super();
		this.name = name;
		this.beakLength = beakLength;
	}

	public Platypus() {
	}

	@Override
	public String toString() {
		return "" + beakLength + " " +name;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		//List<? extends Exception> l = new ArrayList<Throwable>();
		Exception e;
		Platypus p1 = new Platypus("Paula", 3);
		Platypus p2 = new Platypus("Peter", 5);
		Platypus p3 = new Platypus("Peter", 7);
		List<Platypus> list = Arrays.asList(p1, p2, p3);
		
		 //Collections.sort(list, Comparator.comparing(Platypus::getBeakLength));
		 
		//Collections.sort(list, Comparator.comparing(Platypus::getBeakLength).reversed());
		Collections.sort(list, Comparator.comparing(Platypus::getName).thenComparingInt(Platypus::getBeakLength).reversed());
		System.out.println(list);
	}
}
