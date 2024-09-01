package com.sip.ocp17.day19Complement;

public class Main {
	enum Season {WINTER, SPRING, SUMMER, FALL}
	
	String getWeather(Season value) {
		return switch(value) {
		case WINTER -> "Cold";
		case SPRING -> "Rainy";
		case SUMMER -> "Hot";
		case FALL -> "Warm";
		};
		}

	
	public static void printSeason(int month) {
		switch(month) {
		case 1, 2, 3 -> System.out.print("Winter");
		case 4, 5, 6 -> System.out.print("Spring");
		case 7, 8, 9 -> System.out.print("Summer");
		case 10, 11, 12 -> System.out.print("Fall");
		} }

	public static void main(String[] args) {
		printSeason(2);
		//int canis = 1;
		String type = switch(canis) { // DOES NOT COMPILE
		case 1 -> "dog";
		case 2 -> "wolf";
		case 3 -> "coyote";
		};

	}

}
