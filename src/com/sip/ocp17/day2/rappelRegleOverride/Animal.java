package com.sip.ocp17.day2.rappelRegleOverride;



public class Animal {
	
	public  void info()
	{
		System.out.println("Animal");
	}
	
	public Animal getInstance() throws Exception  //checked exception
	{
		return new Animal();
	}

}
