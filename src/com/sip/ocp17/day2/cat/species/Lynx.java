package com.sip.ocp17.day2.cat.species;

import com.sip.ocp17.day2.cat.BigCat;

public class Lynx extends BigCat{
	public static void main(String[] args) {
		//BigCat cat = new BigCat();
		BigCat cat = new Lynx();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		//System.out.println(cat.hasPaws);
		//System.out.println(cat.id);
	}
}
