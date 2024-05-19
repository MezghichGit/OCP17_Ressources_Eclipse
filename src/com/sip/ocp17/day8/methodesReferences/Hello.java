package com.sip.ocp17.day8.methodesReferences;

public class Hello<T> {
	
	
	public Hello(T t)
	{
		System.out.println(t);
	}
	
	public void m(T t)
	{
		System.out.println(t);
	}

	public static <T> void m3(T t)
	{
		
	}
	
	public <T> void m2 (T t)  // méthode générique
	{
		System.out.println(t);
	}


}
