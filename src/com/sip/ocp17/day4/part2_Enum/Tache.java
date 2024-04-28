package com.sip.ocp17.day4.part2_Enum;

public class Tache {

	public static void main(String[] args) {
		System.out.println(Jour.values()[2]);
		System.out.println(Jour.DIMANCHE);
		
		for(Jour jour : Jour.values())
		{
			jour.info();
		}
		
		String day = "dimanche";
		String correctDay = "DIMANCHE";
		Jour d = Jour.valueOf(correctDay);
		Jour d2 = Jour.valueOf(day);

	}

}
