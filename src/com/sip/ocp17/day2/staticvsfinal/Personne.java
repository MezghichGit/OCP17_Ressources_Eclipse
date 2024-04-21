package com.sip.ocp17.day2.staticvsfinal;

public class Personne {

	static int max_age=110; //attribut de classe
	int age; // attribut d'instance
	
	public static void display()
	{
		System.out.println(max_age);
	}
	
	public  void info()
	{
		System.out.println(this.age);
	}
}
