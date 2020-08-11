package com;

import java.util.function.Predicate;

public class Method_vs_Function {

	// Function | Method
	public static void main(String[] args) {

		Predicate<String> predicate = s -> s.isEmpty(); // Lambda Expression / Function
		System.out.println(predicate.test("cts"));

	}

}
