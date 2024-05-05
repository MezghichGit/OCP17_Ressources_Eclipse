package com.sip.ocp17.qcm1;
//Question 7
public class IceCream {

	enum Flavors {
		CHOCOLATE, STRAWBERRY, VANILLA
	}

	public static void main(String[] args) {
		/*Flavors STRAWBERRY = null;
		switch (STRAWBERRY) {
		case Flavors.VANILLA:
			System.out.print("v");
		case Flavors.CHOCOLATE:
			System.out.print("c");
		case Flavors.STRAWBERRY:
			System.out.print("s");
			break;
		default:
			System.out.println("missing flavor");
		}*/
		
		Flavors STRAWBERRY = null;
		switch (STRAWBERRY) {
		case VANILLA: System.out.print("v");break;
		case CHOCOLATE: System.out.print("c");break;
		case STRAWBERRY: System.out.print("s"); break;
		default: System.out.println("missing flavor");
		}
	}

}
