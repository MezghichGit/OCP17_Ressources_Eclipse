package com.sip.ocp17.day2;

public class Oiseau extends Animal{

	public String couleur;
	
	public void info(int age, String nom, String espece, String couleur)
	{
		System.out.println(this.age + " "+this.nom+ " "+this.espece+" "+this.couleur);
	}
	
	@Override
	public void info(int age, String nom)
	{
		System.out.println(this.age + " "+this.nom+" "+this.couleur);
	}
}
