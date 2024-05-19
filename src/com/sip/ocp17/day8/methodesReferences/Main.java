package com.sip.ocp17.day8.methodesReferences;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		
		// Cas 1 : Implémentation via une méthode static 
		
		// Implémentation de l'interface Consumer par une expression Lambda
		//Consumer<List<Integer>> op = (List<Integer> l)->Collections.sort(l);
		
		// Implémentation de l'interface fonctionnelle Consumer par une méthode de réference : static
		/*
		Consumer<List<Integer>> op = Collections::sort;
		
		List<Integer> notes = new ArrayList<>();
		notes.add(14);
		notes.add(8);
		notes.add(16);
		System.out.println(notes);
		
		op.accept(notes);
		
		System.out.println(notes);*/
		/*
		// Cas 2 : Implémentation via une méthode d'instance sur une instance connue
		
		String formation = "OCP";
		// Implémentation par une expression Lambda
		//Predicate<String> filter = (String prefixe)-> formation.startsWith(prefixe);
		
		// Implémentation par une méthode de réference
		
		Predicate<String> filter = formation::startsWith;
		System.out.println(filter.test("OC"));*/
		
		// Cas 3 : Implémentation via une méthode d'instance sur une instance qu'on va connaitre à l'exécution
		
		//Predicate<String> filter = (String ch)->ch.isEmpty();
		/*
		Predicate<String> filter = String::isEmpty; // equivalent avec les méthodes de réferences
		
		String nom = "abc";
		System.out.println(filter.test(nom));*/
		
		// Cas 4 : via le constructeur
		
		//Supplier<ArrayList<String>> provider = ()->new ArrayList<String>(); // implémentation via une expression lambda
		/*
		Supplier<ArrayList<String>> provider = ArrayList<String>::new;
		System.out.println(provider.get());*/
		/*
		ArrayList<String> names = new ArrayList<>();
		names.add("amine");
		names.add("amna");
		names.add("mohamed");
		names.add("anis");
		System.out.println(names); //liste initiale
		
		Predicate<String> filtre = (String nom)->nom.length()<=4;		
			
		names.removeIf(filtre);  // a partir de la version 8, on a ajouter la méthode removeIf
		System.out.println(names); //liste finale*/
		
		// Méthode replaceAll
		/*
		UnaryOperator<Integer> uo = x ->x*x;
		System.out.println(uo.apply(3));
		
		List<Integer> notes = Arrays.asList(2,3,4,5);
		notes.replaceAll(uo);
		System.out.println(notes);
		
		Function<String, Integer> fn = (String ch)-> ch.length();
		System.out.println(fn.apply("OCP"));*/
	}

}
