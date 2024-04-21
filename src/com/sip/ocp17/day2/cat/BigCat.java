package com.sip.ocp17.day2.cat;

public class BigCat {
	public String name = "cat";
	protected boolean hasFur = true;
	boolean hasPaws = true; // package private
	private int id;

	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);
	}

}
