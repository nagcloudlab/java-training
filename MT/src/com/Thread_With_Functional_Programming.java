package com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Thread_With_Functional_Programming {
	
	public static void main(String[] args) {
		
		
		int sum=
		IntStream
		.range(1, 1000)
		.parallel()
		.reduce(0, (acc,n)->acc+n);
		
		System.out.println(sum);
		
	}

}
