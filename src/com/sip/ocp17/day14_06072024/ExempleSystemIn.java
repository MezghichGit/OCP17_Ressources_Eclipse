package com.sip.ocp17.day14_06072024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExempleSystemIn {

	public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Votre nom svp :");
	String nom = reader.readLine();
	System.out.println("vous êtes : "+nom);
	}

}
