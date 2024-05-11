package com.sip.ocp17.day6.designPattern;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestImmutable {
	LocalDate ld;
	public static void main(String[] args) {
		
		List<String> repas = new ArrayList<>();
		repas.add("fish");
		repas.add("meat");
		Animal a = new Animal(2,"Chat",repas);
		
		//System.out.println(a);
		//a.age=20;
		//a.setAge(20);
		//System.out.println(a);
		System.out.println(a.getFoods());
		repas.clear();
		List<String> v = a.getFoods();  // recevoir une copie de la liste
		v.clear();
		System.out.println(a.getFoods());
	}
}
