package com.sip.ocp17.day14_06072024;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintStreamPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		try (PrintWriter out = new PrintWriter("zoo.log")) {
			out.print(5); // PrintWriter method
			out.write(String.valueOf(10)); // Writer method 
		}

	}

}
