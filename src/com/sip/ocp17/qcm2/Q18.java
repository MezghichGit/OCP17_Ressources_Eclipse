package com.sip.ocp17.qcm2;

public class Q18 {

	public static int levelIntensityCalculator(LEVEL level) {
		return switch (level) {
		case EASY : yield 1;
		case MID : yield 2;
		case HARD : yield 3;
		case IMPOSSIBLE : yield 4;
		//default:yield 3;
		};
		
	}
	
	public enum LEVEL {EASY,MID,HARD,IMPOSSIBLE}
	
	public static void main(String[] args) {
		System.out.println(LEVEL.EASY.ordinal());
		System.out.println(LEVEL.MID.ordinal());
		//System.out.println(levelIntensityCalculator(null));

	}

}
