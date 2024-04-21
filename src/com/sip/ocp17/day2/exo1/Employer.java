package com.sip.ocp17.day2.exo1;

public abstract class Employer {
	
	String nom;
	int age;
	double salaireBase=1200;
	String grade="unknown";
	
	public Employer(String nom, int age)
	{
		this.nom = nom;
		this.age = age;
	}
	public void info() {
		System.out.println("Employer [nom=" + nom + ", age=" + age + ", salaireBase=" + salaireBase + ", salaire=" + calculSalaire()+"]");
	}
	
	public abstract double calculSalaire();

}
