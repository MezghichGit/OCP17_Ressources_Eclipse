package com.sip.ocp17.day9.apiStream;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LesInterfacesFonctionnelles {

	public static void main(String[] args) {
		// 1-Predicate
		
		Predicate<String> pred = (String s)-> {return s.length()>4;};
		System.out.println(pred.test("OCP"));
		System.out.println(pred.test("OCAOCP"));
		
		//2-Consumer
		Consumer<String> c = System.out::println;
		c.accept("OCP");
		
		Consumer<String> c2 = (String ch)->{return;};
		//3-Biconsumer
		
		BiConsumer<String,String> bc = (String prenom, String nom)-> System.out.println(prenom+" - "+nom);
		bc.accept("Mohamed Amine", "Mezghich");
		
		//4-Function
		Function<String, Integer> fn = (String ch)->ch.length();
		System.out.println(fn.apply("OCP17"));
		//5-BiFunction
		BiFunction<String,String, Integer> bfn = (String nom, String prenom)->nom.length()+prenom.length();
		System.out.println(bfn.apply("OCP17","OCA"));
		
		//6-UnaryOperator
		UnaryOperator<String>uop = ch -> ch.toUpperCase();
		System.out.println(uop.apply("ocp"));
		//7-BinaryOperator
		BinaryOperator<Integer>bop = (x,y)->x+y;
		System.out.println(bop.apply(2,4));
		
		//8-Supplier
		
		Supplier<LocalDate> sp1 = ()->LocalDate.now();
		Supplier<LocalDate> sp2 = LocalDate::now;  //methode static
		
		System.out.println(sp1.get());
		System.out.println(sp2.get());
		
		//9-BiPredicate
		
		BiPredicate<String, String> bpred = (String phrase , String mot)-> { return phrase.contains(mot);};
		
		String text = "Une formation java sur certif ocp 17";
		String keyword = "ocp";
		System.out.println(bpred.test(text,keyword));
		
	}

}
