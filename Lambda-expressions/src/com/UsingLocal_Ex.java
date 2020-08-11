package com;

import java.util.function.Predicate;

public class UsingLocal_Ex {

	public static void main(String[] args) {

		String local = "cts"; // effective final

		Predicate<String> predicate = s -> {
			return s.equals(local);
		};

		System.out.println(predicate.test("cts"));

		// local = "company";

	}

}
