package com.sip.ocp17.day9.apiStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class ExempleStream {

	public static void main(String[] args) {
		
		Stream<Integer> numbers = Stream.iterate(10, x->x+1).limit(10);
		numbers.forEach(System.out::println);
		
		BiConsumer<String, String> bs;
		
		/*
		Stream<Integer> stream = Stream.of(10,2,8,14,15,30); // of: méthode source.
		
		stream.filter(x->x>10).sorted(); // deux méthodes intermédiaires
		
		stream.forEach(System.out::println);*/ // forEach : méthode terminale
		
		//Exemple 1
		//Stream.of(10,2,8,14,15,30).filter(x->x>10).sorted().forEach(System.out::println);
		
		//Exemple 2
		//long res = Stream.of(10,2,8,14,15,30).filter(x->x>10).sorted().peek(System.out::println).count();
		//System.out.println(res);
		
		//System.out.println(Stream.of(10,2,8,14,15,30).filter(x->x>10).sorted().peek(System.out::println).count());
		
		
	}

}
