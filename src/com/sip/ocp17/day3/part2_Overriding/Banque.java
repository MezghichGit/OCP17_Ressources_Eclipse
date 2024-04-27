package com.sip.ocp17.day3.part2_Overriding;

public class Banque {

	public static void main(String[] args) {
		CompteBancaire cb1 = new CompteBancaire(123,500);
		CompteBancaire cb2 = new CompteBancaire(123,500);
		
		System.out.println(cb1.equals(cb2));
		String ch1 = new String("ocp");
		String ch2 = new String("ocp");
		
		System.out.println(ch1.equals(ch2));

	}

}
