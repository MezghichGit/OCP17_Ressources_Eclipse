package com.sip.ocp17.day2;

public class Calculatrice {
	
	/*public static void operation(String a, String b)
	{
		System.out.println("String a, String b");
	}*/
	
	public static void operation(Object a, Object b)
	{
		System.out.println("Object a, Object b");
	}
	
	
	//Overlaod
	public static void somme(int a, int b)
	{
		System.out.println("int a, int b");
	}
	
	public static void somme(Integer a, Integer b)
	{
		System.out.println("Integer a, Integer b");
	}
	
	public static void somme(double a, double b)
	{
		System.out.println("double a, double b");
	}
	
	public static void somme(int ...a)
	{
		System.out.println("int ...a");
	}
	
	public static void main(String[]args)
	{
		//somme(10,2);
		operation("a", "b");
	}

}
