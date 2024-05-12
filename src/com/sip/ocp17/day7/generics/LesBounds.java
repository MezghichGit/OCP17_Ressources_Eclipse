package com.sip.ocp17.day7.generics;
import java.util.*;
public class LesBounds {

	public static void main(String[] args) {
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		a = o;
		
		List<Oiseau> lo = new ArrayList<>();
		List<Animal> la = new ArrayList<>();
		//la = lo;
		
		// 1)Unbounded
		List<?>list; // list est une collection unbounded // sans borne
		
		/*list = new ArrayList<String>();
		list = la;
		list = lo;*/
		
		// 2)UpperBound
		
		List<? extends Animal> lu; //lu peut être affecter à n'importe quelle list d'objet de type Animal ou class fille
        lu = la;
        lu = lo;
        
        // 3)Lower Bound : l'inverse
        
        List<? super Oiseau> ll; // ll peut pointer sur une liste de oiseau ou toute liste contenant des elements super de Oiseau
        ll = la;
        ll = lo;
        
        List<String>
	}

}
