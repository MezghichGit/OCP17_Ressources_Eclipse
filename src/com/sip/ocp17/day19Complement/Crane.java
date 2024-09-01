package com.sip.ocp17.day19Complement;

public record Crane(int numberEggs, String name) { 
	public Crane(String firstName, String lastName) {
		this(0, firstName + " " + lastName);
		}

	//private static int type = 10;
	//public int size; // DOES NOT COMPILE
	//private boolean friendly; // DOES NOT COMPILE

}
