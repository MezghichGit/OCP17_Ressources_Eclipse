package com.sip.ocp17.day9.apiStream;

import java.util.Optional;

public class DemoOptional {

	/*public static double moyTab(double... tab) {
		double moy = 0;
		double som = 0;
		if (tab.length == 0)
			return 0;
		else {
			for (double v : tab) {
				som = som + v;
			}
			moy = som / tab.length;

			return moy;
		}
	}*/
	
	public static Optional<Double> moyTab(double... tab) {
		double moy = 0;
		double som = 0;
		
		if (tab.length == 0)
			return Optional.empty();
		else {
			for (double v : tab) {
				som = som + v;
			}
			moy = som / tab.length;

			return Optional.of(moy);
		}
	}

	public static void main(String[] args) {

		/*System.out.println(moyTab(10, 2, 6, 2));
		System.out.println(moyTab(10, -10));
		System.out.println(moyTab()); // la valeur 0.0 n'est le bon resulat*/
		
		Optional<Double> res = moyTab(10, 2, 6, 2);
		//Optional<Double> res = moyTab();
		/*if(res.isPresent())
			System.out.println(res.get());
		else
			System.out.println(res);*/
		res.ifPresent(System.out::println);

	}

}
