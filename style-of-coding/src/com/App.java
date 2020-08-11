package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// ..
		System.out.println(getEvenNumbers(numbers));
		System.out.println(getOddNumbers(numbers));
		System.out.println(getEvenNumbersAboveFive(numbers));

		// imperative style
//		for (int i = 0; i < numbers.size(); i++) {
//			int n=numbers.get(i);
//			if(n%2==0)
//				System.out.println(n);
//		}

		// declarative style    with function ===> Functional Programming
		filter(numbers, n->n%2==0);  // intention

	}

	// declarative style  ( implementation )
	public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer integer : numbers) {
			if (predicate.test(integer))
				result.add(integer);
		}
		return result;
	}

	// imperative style coding => What/intention + How/implementation
	// tightly-coupled

	private static List<Integer> getEvenNumbers(List<Integer> numbers) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer integer : numbers) {
			if (integer % 2 == 0)
				result.add(integer);
		}
		return result;
	}

	private static List<Integer> getEvenNumbersAboveFive(List<Integer> numbers) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer integer : numbers) {
			if (integer > 5 && integer % 2 == 0)
				result.add(integer);
		}
		return result;
	}

	private static List<Integer> getOddNumbers(List<Integer> numbers) {
		List<Integer> result = new ArrayList<Integer>();
		for (Integer integer : numbers) {
			if (integer % 2 != 0)
				result.add(integer);
		}
		return result;
	}
}
