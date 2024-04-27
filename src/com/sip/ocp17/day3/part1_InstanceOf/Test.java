package com.sip.ocp17.day3.part1_InstanceOf;

public class Test {

	public static void doSomething(Object obj)
	{
		
		//((Oiseau)obj).voler();
		
		
		// si o de type oiseau, appeler voler sinon appeler nager
		if(obj instanceof Oiseau)
		{
			((Oiseau)obj).voler();
		}
		
		else if(obj instanceof Poisson)
		{
			((Poisson)obj).nager();
		}
		else
			System.out.println("Variable nulle");
			
	}
	
	public static void main(String[] args) {
		
		Object obj = null;
		//((Oiseau) obj).voler();
		
		//boolean res = obj instanceof Animal;
		//System.out.println("obj instanceof Animal :" +res);
		//part 2
		/*
		Oiseau o = new Oiseau();
		
		Poisson p = new Poisson();
		
		doSomething(o);  // voler
		doSomething(p);*/  // nager
		doSomething(obj);
		/*
		Animal a = new Animal();
		
		boolean res1 = a instanceof Animal;
		System.out.println("a instanceof Animal :" +res1);
		
		Oiseau o = new Oiseau();
		
		boolean res2 = o instanceof Animal;
		System.out.println("o instanceof Animal : "+res2);
		
		Bus b = new Bus();
		
		boolean res3 = b instanceof Vehicule;
		System.out.println("b instanceof Vehicule :"+res3);*/
		/*
		Animal a = new Animal();
		boolean res4 = a instanceof Oiseau;
		System.out.println("a instanceof Oiseau :" +res4);
		*/
		Oiseau o = new Oiseau();
		Poisson p = new Poisson();
		
		/*boolean res5 = o instanceof Poisson;
		System.out.println("o instanceof Poisson:" +res5);*/
		
		
		Bus b = new Bus();
		boolean res3 = b instanceof Vehicule;
		System.out.println("b instanceof Vehicule :"+res3);
		
		Oiseau o1 = new Oiseau();
		boolean res4 = o1 instanceof Vehicule;
		System.out.println("o1 instanceof Vehicule :"+res4);
		

	}

}
