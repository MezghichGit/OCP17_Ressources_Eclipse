package com.sip.ocp17.qcm1;

import java.util.List;
import java.util.stream.Collectors;

public class QCM1_48 {

	public static void main(String[] args) {
		List<String> chars=List.of("O","C","P","1","7");
		//String message=chars.stream().collect(Collectors.joining());
		//String message=chars.stream().collect(Collectors.joining(""));
		//String message=chars.stream().collect(Collectors.joining("","",""));
		//String message=chars.stream().collect(Collectors.reducing((a,c)->a.concat(c)));
		String message=chars.stream().collect(Collectors.reducing("",(a,c)->a.concat(c)));
		System.out.println(message);
		
		double exampleNumber = 25.01;
		System.out.println(Math.round(exampleNumber));//long
		System.out.println(Math.ceil(exampleNumber));//double
		System.out.println(Math.floor(exampleNumber));//double
	}
}
