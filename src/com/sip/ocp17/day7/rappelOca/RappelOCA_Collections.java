package com.sip.ocp17.day7.rappelOca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RappelOCA_Collections {

	public static void main(String[] args) {
		//Avant l'apparition des collections : version 5 java
		/*
		List names = new ArrayList();
		names.add("amine");
		names.add(10);
		names.add(true);
		for(Object obj:names)
		{
			String temp = (String)obj;
			System.out.println(temp.length());
		}*/
		
		//A partir de la version 5 : Introduction du concept generics
		//List<String> names = new ArrayList<String>();
		List<String> names = new ArrayList<>();
		names.add("amine");
		names.add("10");
		names.add("true");
		
		for(String obj:names)
		{
			System.out.println(obj.length());
		}
		
		Collections.sort(names);// méthode sort de la class Collections
		System.out.println(names);
		

	}

}
