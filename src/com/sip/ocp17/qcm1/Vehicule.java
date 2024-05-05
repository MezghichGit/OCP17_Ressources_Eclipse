package com.sip.ocp17.qcm1;

public  interface Vehicule {
	public void info();
	 void print(); // implicitement public
	public void start();
	
	public default void display() {} // à partir de Java 8+
	public static void display2() {} // à partir de Java 8+
	
	
	private  void display1() {} // à partir de Java 11+
	private static void static_display1() {} // à partir de Java 11+

}
