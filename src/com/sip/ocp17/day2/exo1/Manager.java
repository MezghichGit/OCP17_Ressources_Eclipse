package com.sip.ocp17.day2.exo1;

public class Manager extends Employer{
	public Manager(String nom, int age) {
		super(nom,age);
	}

	@Override
	public double calculSalaire() {
		return this.salaireBase + this.salaireBase*0.2;	
	}

}
