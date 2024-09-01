package com.sip.ocp17.day19Complement;

public class TestRecord {

	public static void main(String[] args) {
		var mommy = new Crane(4, "Cammy");
		System.out.println(mommy.numberEggs()); // 4
		System.out.println(mommy.name()); // Cammy
		
		System.out.println(mommy);
		System.out.println(mommy.toString());
		
		var mommy2 = new Crane("abc", "Cammy");
		System.out.println(mommy2);


	}

}
