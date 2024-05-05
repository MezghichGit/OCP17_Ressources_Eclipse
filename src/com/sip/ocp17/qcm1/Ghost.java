package com.sip.ocp17.qcm1;

public class Ghost {
	public static void boo() {
		System.out.println("Not scared");
	}
	//protected  final class Spirit {
	protected  class Spirit {
		public void boo() {
			System.out.println("Booo!!!");
		}
	}

	public static void main(String... haunt) {
		var g = new Ghost().new Spirit() {};  // une classe anonyme qui implémente une interface ou hérite de la classe Spirit
		boo();
		Ghost.boo(); //F
		new Ghost().boo();
		g.boo();

	}
}