package com.sip.ocp17.day9.lesInterfacesFonctionnelles;

class GorillaFamily {
	
	String walk = "walk";

	void everyonePlay(boolean baby) {
		//baby = false;
		String approach = "amble";
		 //approach = "run";
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> approach);
	}

	void play(Gorilla g) {

		System.out.println(g.move());
	}

}
