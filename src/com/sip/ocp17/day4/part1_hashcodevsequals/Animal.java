package com.sip.ocp17.day4.part1_hashcodevsequals;

public class Animal {

	@Override
	public int hashCode()
	{
		return 7;
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.hashCode());
		
		Animal a1 = new Animal();
		System.out.println(a1.hashCode());

	}

}
