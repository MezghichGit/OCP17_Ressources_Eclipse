package com.sip.ocp17.day4.part3_NestedClasses;

public class Voiture {

	private String marque;
	String modele;
	int vitesseMax;

	// inner class
	public class Moteur {
		static double volume;
		int puissance;
		
		public void getMarqueVoiture()
		{
			volume++;
			Voiture v = new Voiture();
			System.out.println(v.marque);
			System.out.println(marque);
		}
	}

	// static nested classes

	static class PaysContruction {
		String pays;
		String adresse;
	}

	// local inner class

	public void info() {
		 int x = 10; // effectively final : on ne met pas le mot final mais on doit pas changer la valeur de x
		 final int y = 20;  // final
		 class Test {
			static int vitesse;
			
			public void display()
			{
				vitesse++;
			
				System.out.println(x);
			}
		}
	}

	// Anonymous local inner class
	interface Vehicule {
		int vitesse=240;
		public abstract void test();
	}
	
	public void affichage()
	{
	  Vehicule  v = new Vehicule() {
	  public void test() {}
	  };
	}
}
