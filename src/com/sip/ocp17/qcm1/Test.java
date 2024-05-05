package com.sip.ocp17.qcm1;

@FunctionalInterface
public interface Test {
	
	public void op(Camel c);
	
	public default void display()
	{}
	
	public static void displayStatic()
	{}
	
	
	private int somme(int a, int b) {
	 return a+b;	
	}
	
	private static int sommeStatic(int a, int b) {
		 return a+b;	
		}

}
