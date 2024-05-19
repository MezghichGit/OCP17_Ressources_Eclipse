package com.sip.ocp17.day8.methodesReferences;

public class UseHello {

	public static void main(String[] args) {
		Hello<String> hello = new Hello<>("Bonjour");
		hello.m("bonsoir");
		hello.m2(true);

	}

}
