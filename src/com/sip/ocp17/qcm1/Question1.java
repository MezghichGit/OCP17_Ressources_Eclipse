package com.sip.ocp17.qcm1;

public class Question1 {

	 int x=20; //attribut d'instance
	 static int y=10; // attribut de classe
	
	public static void main(String[] args) {
		final Question1 q = new Question1();
		//q = new Question1();
		q.x = 30;
		q.x = 34;
		
		int k = 20; // effectively final
		System.out.println(k);
		k++; // k n'est plus effectively final
		
		final var nom = "Amine"; // type par inférence
		//nom = "Mohamed";
		

	}

}
