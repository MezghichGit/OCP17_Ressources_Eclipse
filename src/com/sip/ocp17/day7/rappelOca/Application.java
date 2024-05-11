package com.sip.ocp17.day7.rappelOca;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		// 1-Les tableaux
		/*
		int tab[]= {10,20,30};
		String names[] = {"amine","sofien","marwa"};
		Double moyenne[] = {18.5, new Double(15.5), 16.5};
		
		String emps[] = new String[2];
		emps[0]="amine";
		emps[1]=new String("salah");*/
		
		// 2- Les méthodes de recherche et de tri
		
		// sort : trier le tableau
		int tab[]= {12,18,3,1,14};
		
		/*System.out.println("Avant le tri");
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}
		*/
		Arrays.sort(tab);
		
		/*System.out.println("Après le tri");
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}*/
		// 1	3	12	14	18
		// binarySearch : vérifier si l'élement existe ou pas
		// cette méthode exige à ce que le tableau soit trié : recherche dichotomique
		// si le tableau n'est trié : surprise
		System.out.println(Arrays.binarySearch(tab, 1));

	}

}
