package com.sip.ocp17.day18;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test_Locale {

	public static void main(String[] args) {
		//Locale locale = Locale.getDefault();
		//System.out.println(locale);
		
		Locale us = new Locale("en", "US");
		//Locale france = new Locale("fr", "FR");
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		
		//System.out.println(rb.getString("open3"));
		System.out.println(rb.getString("hello"));

	}

}
