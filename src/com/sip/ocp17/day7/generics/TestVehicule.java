package com.sip.ocp17.day7.generics;

import java.util.ArrayList;
import java.util.List;

public class TestVehicule {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		Vehicule<String> vs = new Voiture<>();
		vs.addToVehicule("String");
		vs.display("BMW");
	}

}
