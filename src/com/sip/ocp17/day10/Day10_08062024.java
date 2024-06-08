package com.sip.ocp17.day10;

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Day10_08062024 {

	public static void main(String[] args) {
		
		//Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		
		
	
		//s.findAny().ifPresent(System.out::println);
		//s.findFirst().ifPresent(System.out::println);
		/*
		List<String> animals = Arrays.asList("monkey", "gorilla", "bonobo","monkey21","monkey21","monkey23","monkey24", "gorilla2", "bonobo2");
		//Stream<String> as = animals.stream();
		Stream<String> as = animals.parallelStream();
		as.findAny().ifPresent(System.out::println);*/
		/*
		Stream<Integer> stream = Stream.of(12,2);
		
		System.out.println(stream.reduce((a, b) -> a*b));*/
		//System.out.println(stream.reduce(10,(a, b) -> a*b));
		
		//Stream<StringBuilder> s = Stream.of(new StringBuilder("monkey"), new StringBuilder("bonobo"), new StringBuilder("gorilla"), new StringBuilder("go")).parallel();
		//Stream<StringBuilder> s = Stream.of(new StringBuilder("monkey"), new StringBuilder("bonobo"), new StringBuilder("gorilla"));
		//List<String> ss = s.collect(Collectors.toList());
		//System.out.println(ss);
		
	 /* StringBuilder sb = s.collect(StringBuilder::new,(x,y)->x.append(y), (x,y)->x.append("**").append(y));
	  System.out.println(sb.toString());*/
		
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		List<String> three = Arrays.asList();
		
		Stream<List<String>> animals = Stream.of(zero, one, two,three);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		

	}

}
