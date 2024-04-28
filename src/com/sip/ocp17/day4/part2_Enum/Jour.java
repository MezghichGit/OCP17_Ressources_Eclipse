package com.sip.ocp17.day4.part2_Enum;

public enum Jour {
	
	LUNDI(8), MARDI(7), MERCREDI(4), JEUDI(8), VENDREDI(6), SAMEDI(3), DIMANCHE(1);
	
	private int nbrHeureTravail;
	
	private Jour(int nbHt)
	{
		this.nbrHeureTravail = nbHt;
	}
	
	public void info()
	{
		System.out.println(this.ordinal() +" : "+this.name()+" : "+ this.nbrHeureTravail);
	}
}
