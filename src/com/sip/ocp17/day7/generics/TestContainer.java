package com.sip.ocp17.day7.generics;

public class TestContainer {

	
	// une méthode générique
	
	public static <T,U, R> R info2(T v1, U v2, R r)
	{
		System.out.println("v1 : "+v1+ " v2 : "+v2);
		R x = r;
		return x;
	}
	
	
	public static <T> void info(T v1, T v2)
	{
		System.out.println("v1 : "+v1+ " v2 : "+v2);
	}
	
	
	public static void main(String[] args) {
		
		Double res = info2("abc", true,12.5);
		
		info("amine","mezghich");
		info(12,20);
		info(true, false);
		
		Container<String> cs = new Container<>("voitures");
		
		Container<StringBuilder> cb = new Container<>(new StringBuilder("Moto"));

	}

}
