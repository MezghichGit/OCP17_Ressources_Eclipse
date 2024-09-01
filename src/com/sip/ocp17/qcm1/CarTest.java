package com.sip.ocp17.qcm1;


class Vehicule2 {
	public Vehicule2() {
		System.out.println("Vehicule is constructed");
	}
}

class Car extends Vehicule2 {
	public Car() {
		System.out.println("Car is constructed");
	}
}

class Mercedes extends Car {
	public Mercedes() {
		this(10);
		System.out.println("Mercedes is constructed");
	}
	
	public Mercedes(int x) {
		
		System.out.println("Mercedes is constructed");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Vehicule2 mercedes = new Mercedes();

	}
}


