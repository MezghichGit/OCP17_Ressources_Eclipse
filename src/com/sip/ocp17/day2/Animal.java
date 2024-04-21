package com.sip.ocp17.day2;

public class Animal {

	public int age;
	public String nom;
	String espece; //default ou package private
	protected boolean sauter;
	private double poids;
	
	// exemple d'overload
	public void info(int age, String nom)
	{
		System.out.println(this.age + " "+this.nom);
	}
	
	public void info(int age, String nom, String espece)
	{
		System.out.println(this.age + " "+this.nom+ " "+this.espece);
	}
}
