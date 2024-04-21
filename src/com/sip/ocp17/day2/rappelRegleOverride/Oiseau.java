package com.sip.ocp17.day2.rappelRegleOverride;
import java.io.IOException;
public class Oiseau extends Animal{

	@Override
	public void info()
	{
		System.out.println("Oiseau");
	}
	
	@Override
	public Oiseau getInstance() throws IOException  //checked exception
	{
		return new Oiseau();
	}

}
