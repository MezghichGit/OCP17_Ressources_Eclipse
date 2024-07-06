package com.sip.ocp17.day13_30062024;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("file.separator"));
		//System.out.println(java.io.File.separator);
		File file = new File("/home/smith/data/zoo.txt");
		System.out.println(file.exists());
		File file2 = new File("C:/Users/amine/Desktop/OCP17/usefull_links.txt");
		System.out.println(file2.exists());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		File file3 = new File("C:/","usefull_links.txt");
		System.out.println(file3);
		System.out.println(file3.exists());

	}

}
