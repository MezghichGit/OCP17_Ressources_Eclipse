package com.sip.ocp17.qcm1;

public interface Q6 {
	
	public default void info1() {
		info();
	}
	
	public default void info2() {
		info();
		System.out.println("Hello Java 8");
		
		
	}
	
	private void info() {
		System.out.println("Hello Java 11");
		System.out.println("Hello Java 17");
	}

}
