package com.sip.ocp17.day4.part1_hashcodevsequals;

import java.util.Objects;

public class Personne {
	int cin;
	int age;
	public Personne(int cin, int age, String nom) {
		super();
		this.cin = cin;
		this.age = age;
		this.nom = nom;
	}
	String nom;
	@Override
	public String toString() {
		return "Personne [cin=" + cin + ", age=" + age + ", nom=" + nom + "]";
	}
	@Override
	public int hashCode() {
		//return Objects.hash(age, cin, nom);
		return 3*age*cin*nom.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return age == other.age && cin == other.cin && Objects.equals(nom, other.nom);
	}

}
