package com.sip.ocp17.day2.exo1;

public class Directeur extends Employer {
	public Directeur(String nom, int age) {
		super(nom,age);
	}

	@Override
	public double calculSalaire() {
		return this.salaireBase + this.salaireBase * 0.5;
	}

}
