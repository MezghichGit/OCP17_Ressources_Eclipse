package com.sip.ocp17.day7.collections;
/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;*/
import java.util.*;
public class Test {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		System.out.println(list.add("Sparrow")); // true
		System.out.println(list.add("Sparrow")); // true
		
		System.out.println(list);
	
		Set<String> set = new HashSet<>();
		System.out.println(set.add("Sparrow")); // true
		System.out.println(set.add("Sparrow")); // false
		
		System.out.println(set);*/
		
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("koala", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala"); // bamboo
		System.out.print(food);
		for (String key: map.keySet())
			System.out.print(key + ","); // koala,giraffe,lion,



	}

}
