package com.sip.ocp17.qcm1;

public class Question2 {
	
	static int v = 10;

	enum Saison{
		ETE,AUTOMNE, PRINTEMPS,HIVER;
		static final Saison DEFAULT =AUTOMNE;
		public void info()
		{
			System.out.println(DEFAULT);
		}
		static int x =10;
		
		private Saison(){}
	}
	public static void main(String[] args) {
		Saison vs = Saison.AUTOMNE;
		System.out.println(v);

	}

}
