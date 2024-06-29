package com.sip.ocp17.day12_29062024;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class CallableVSSupplier {
	
	public static void use(Supplier<String> t)
	{
		System.out.println(t.get());
	}
	
	public static void use(Callable<String> t) throws Exception
	{
		System.out.println(t.call());
	}

	public static void main(String[] args) throws Exception {
		Supplier<String> s = ()-> new String("OCP");
		Callable<String> c = ()->new String("OCP");
		
		use((Supplier)()->new String("OCP17"));
		use((Callable)()->new String("OCP17"));
		
		

	}

}
