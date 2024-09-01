package com.sip.ocp17.qcm2;

import java.util.stream.Stream;

public class Q24 {
	enum Saison implements IVehicule {A, B, C};
	
	public static void myMethod(int nyInt,String ... strings) {}
	public static void myMethod(long nyInt,String[] strings) {}
	public static void myMethod(int myDouble,String[] strings) {}
	
	public static void main(String[] args) throws InterruptedException {
		
		//myMethod(10, "oca","ocp","spring");
		myMethod(10, new String[] {"oca","ocp","spring"});
		Thread thread = new Thread();
		thread.sleep(1000);
	}
}
