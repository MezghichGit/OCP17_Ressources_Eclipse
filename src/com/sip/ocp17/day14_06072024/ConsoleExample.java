package com.sip.ocp17.day14_06072024;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Paths;

public class ConsoleExample {
	/* ConsoleExample(){
		 this();
	 }*/
	

	public static void main(String[] args) throws IOException {
		//System.out.println(Paths.get("c:\\myFolder").toRealPath());
		/*System.out.println(Paths.get(".").toRealPath());
		Console console = System.console();
		if(console!=null)
		{
		String nom = console.readLine("Donner votre nom : ");
		console.writer().println("Vous êtes :"+ nom);
		}
		else
			System.out.println("Console object is not available");*/
		
		long myNumber = 100<=Math.max(100, 50)? false?5:2*3:true?7+1:4+6;
		System.out.println(myNumber);

	}

}
