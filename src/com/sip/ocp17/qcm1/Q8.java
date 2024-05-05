package com.sip.ocp17.qcm1;

@FunctionalInterface // annotation c'est optionnel
public interface Q8 {

	public void info(); // méthode abstraite

	public default void info2() {
	}

	private void info3() {
	}

	private static int get() {
		return 2;
	}

	static int get2() {
		return 2;
	}

	// ces méthode ne sont pas comptabilisés comme méthodes abstraites de
	// l'interface
	public String toString(); // méthode abstraite de la classe Object

	public boolean equals(Object obj); // méthode abstraite de la classe Object

	public int hashCode();// méthode abstraite de la classe Object
}
