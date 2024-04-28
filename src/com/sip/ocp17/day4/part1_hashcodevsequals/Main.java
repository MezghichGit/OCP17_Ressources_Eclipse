package com.sip.ocp17.day4.part1_hashcodevsequals;

public class Main {

	public static void main(String[] args) {
		Personne p1 = new Personne(10,25,"Amine");
		Personne p2 = new Personne(10,25,"Amine");
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
