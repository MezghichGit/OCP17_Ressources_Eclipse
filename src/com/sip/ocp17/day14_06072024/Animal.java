package com.sip.ocp17.day14_06072024;

import java.io.Serializable;

public class Animal implements Serializable {
	/*
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private char type;

	public Animal(String name, int age, char type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public String getName() { return name;}
	public int getAge() { return age;}
	public char getType() { return type;}


	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}*/
	
	private static final long serialVersionUID = 2L;
	private transient String name; // ignore serialization of this attribute
	private transient int age = 10; // ignore serialization of this attribute
	private static char type='C'; // ignore serialization of this attribute

	{
		this.age = 14;
	}
	public Animal(String name, int age, char type) {
		this.name = name;
		this.age = age;
		//this.type = type;
		Animal.type = type;
	}
	
	public Animal() {
		this.name = "Unknown";
		this.age = 12;
		type = 'Q';
	}
	
	public String getName() { return name;}
	public int getAge() { return age;}
	public char getType() { return type;}


	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}


}