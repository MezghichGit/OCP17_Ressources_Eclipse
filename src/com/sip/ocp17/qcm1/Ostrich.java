package com.sip.ocp17.qcm1;

public class Ostrich {
	//private static int count;
	private int count;  // il lui faut une instance pour y accéder
	private interface Wild {
	}

	 static class OstrichWrangler implements Wild {
		public int stampede() {

			return new Ostrich().count;
			//return count;
		}
	}
}