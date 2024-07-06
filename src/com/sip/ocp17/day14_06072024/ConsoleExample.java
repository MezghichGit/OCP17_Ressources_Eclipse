package com.sip.ocp17.day14_06072024;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();
		if(console!=null)
		{
		String nom = console.readLine("Donner votre nom : ");
		console.writer().println("Vous êtes :"+ nom);
		}
		else
			System.out.println("Console object is not available");

	}

}
