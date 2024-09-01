package com.sip.ocp17.qcm4;

import java.time.Duration;
import java.time.Period;

public class Q10 {
	public enum LEVEL{EASY,MID,HARD,IMPOSSIBLE, OTHER}
	
	public static LEVEL levelCalculator(int intensity) {
		return switch (intensity) {
        case 1, 2 -> LEVEL.EASY;
        case 3, 4 ->  {yield LEVEL.MID;} 
        case 5, 6 ->  LEVEL.HARD; 
        case 7, 8 -> { yield LEVEL.IMPOSSIBLE; }
        default -> throw new IllegalArgumentException("Invalid intensity level: " + intensity);
    };
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Period period = Period.ofDays(10);
	Duration duration = Duration.ofDays(10);
	System.out.println(period);
	System.out.println(duration);
	//period.plus(duration);

}

}
