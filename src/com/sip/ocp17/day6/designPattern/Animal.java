package com.sip.ocp17.day6.designPattern;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
	
	private final int age;
	private final String nom;
	private final List<String>foods;
	
	public Animal(int age, String nom, List<String> foods) {
		this.age = age;
		this.nom = nom;
		this.foods = new ArrayList(foods);
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", nom=" + nom + ", foods=" + foods + "]";
	}

	/*public void setAge(int age) {
		this.age = age;
	}*/

	public String getNom() {
		return nom;
	}

	/*public void setNom(String nom) {
		this.nom = nom;
	}*/

	public List<String> getFoods() {
		return new ArrayList(foods);  // renvois une copie de la liste
	}

	/*public void setFoods(List<String> foods) {
		this.foods = foods;
	}
	*/

}
