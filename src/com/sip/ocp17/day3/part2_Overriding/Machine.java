package com.sip.ocp17.day3.part2_Overriding;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Machine {

	String reference;
	double prix;
	
	

	@Override
	public String toString() {
		//return "Machine [reference=" + reference + ", prix=" + prix + "]";
		return ToStringBuilder.reflectionToString(this);
	}



	public static void main(String[] args) {
		Machine m = new Machine();
		System.out.println(m.toString());
		System.out.println(m);

	}

}
