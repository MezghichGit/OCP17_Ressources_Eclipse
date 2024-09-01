package com.sip.ocp17.day17;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Car {
	String s;
	double d;
	boolean four;

	public Car(String s, double d, boolean four) {
		this.s = s;
		this.d = d;
		this.four = four;
	}
	public boolean isFourWheeleDrive()
	{
		return this.four;
	}
	@Override
	public String toString() {
		return "Car [s=" + s + ", d=" + d + ", four=" + four + "]";
	}
	
}
public class Q11 {
	public static void main(String[] args) {
		List<Car> myCars = List.of(
				new Car("Mercedes", 2500.0, false), 
				new Car("BMW", 4500.0, true),
				new Car("Audi", 2500.0, true));
		Map<Boolean, List<Car>> carsMap = 
				myCars.stream().collect(Collectors.partitioningBy(Car::isFourWheeleDrive));
		 //Map<String, Car> collect = myCars.stream().collect(Collectors.toMap(e->e.s,Function.identity()));
		System.out.println(carsMap);
		 //System.out.println(collect);
}
}
