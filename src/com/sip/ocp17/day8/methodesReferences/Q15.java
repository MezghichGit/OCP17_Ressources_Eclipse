package com.sip.ocp17.day8.methodesReferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q15 {
	class A{}
	class B extends A{}

	/*<B> B method3(List<B> list) {
		
		return new B(); // DOES NOT COMPILE
	}*/
	

	public static void main(String[] args) {
		
		Comparator<Integer> c1 = (o1, o2) -> o2 -o1;
		Comparator<Integer> c2 = Comparator.naturalOrder();
		Comparator<Integer> c3 = Comparator.reverseOrder();

		var list = Arrays.asList(5, 4, 7, 2);
		Collections.sort(list, c3 );
		//Collections.reverse(list);
		//Collections.reverse(list);
		System.out.println(Collections.binarySearch(list, 2));
		
		


	}

}
