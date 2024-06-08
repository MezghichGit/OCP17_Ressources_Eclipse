package com.sip.ocp17.day10;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitvesStreams {

	public static void main(String[] args) {
		//IntStream intStream = IntStream.of(1, 2, 3);
		//IntStream intStream = IntStream.of();
		//OptionalDouble avg = intStream.average();
		//System.out.println(avg.getAsDouble());
		//System.out.println(avg.isPresent());
		
		/*Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());*/
		IntStream stream = IntStream.rangeClosed(1,10);
		OptionalDouble optional = stream.average();
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(() -> Double.NaN)); 

	}

}
