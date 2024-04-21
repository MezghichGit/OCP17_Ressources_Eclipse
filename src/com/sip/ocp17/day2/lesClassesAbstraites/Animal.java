package com.sip.ocp17.day2.lesClassesAbstraites;

public abstract class Animal {
	String espece;
	int age;
	public void manger() {
		System.out.println("Je veux manger");
	}
	public abstract void seDeplacer();
	
}
