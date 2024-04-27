package com.sip.ocp17.day3.part2_Overriding;

public class CompteBancaire {
	int rib;
	double solde;

	public CompteBancaire(int rib, double solde) {
		this.rib = rib;
		this.solde = solde;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CompteBancaire) {
			CompteBancaire compte = (CompteBancaire) obj;
			if (this.rib == compte.rib && this.solde == compte.solde) {
				return true;
			}

		}
		return false;
	}

}
