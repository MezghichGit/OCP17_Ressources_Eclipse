package com.sip.ocp17.day4.part1_hashcodevsequals;

import java.util.*;


public class Application {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();  //ordered
		list.add(12);
		list.add(4);
		list.add(8);
		list.add(21);
		list.add(4);
		System.out.println(list);
		
		
		Set<Integer> set = new HashSet<>();  // l'insertion se base sur le hashcode
		//Set<Integer> set = new TreeSet<>(); 
		set.add(12);
		set.add(4);
		set.add(8);
		set.add(21);
		set.add(4);
		System.out.println(set);

	}

}
