package com.sip.ocp17.qcm2;

//@FunctionalInterface
public abstract interface IVehicule {
	
	// < version 8
	
	public abstract boolean test(String ch);
	
	//version 8
	default public void info() {}
	
	static public void info2() {}
	
	//version 10
	private void info3() {}
	private static void info4() {}

}
