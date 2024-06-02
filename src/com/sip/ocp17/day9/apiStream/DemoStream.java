package com.sip.ocp17.day9.apiStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class DemoStream {

	public static void main(String[] args) {
		
		Predicate<Integer> pred = (Integer x)->{ return x>=10;};
		Consumer<Integer> cons = (Integer x )-> System.out.println(x);
		Consumer<Integer> cons2 = System.out::println;
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(2);
		numbers.add(20);
		numbers.add(10);
		numbers.add(9);
		
		System.out.println(numbers);
		
		Stream<Integer> st = numbers.stream();
		st.filter(pred).forEach(cons2);
		
	}

}
