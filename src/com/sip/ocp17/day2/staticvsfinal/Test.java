package com.sip.ocp17.day2.staticvsfinal;

public class Test {

	public static void main(String[] args) {
		System.out.println(Personne.max_age);
		Personne p = new Personne();
		System.out.println(p.age);
		p.info();
		Personne.display();
		
		final int x = 10;  // final = constante
		//x= 11;
		

	}

}
