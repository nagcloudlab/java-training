package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.model.Apple;
import com.model.Color;

public class FunctionComposition_Ex {

	public static void main(String[] args) {

		List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN, "India"), new Apple(155, Color.GREEN, "US"),
				new Apple(80, Color.RED, "Aus"));

		Comparator<Apple> byWeight = (a1, a2) -> Integer.compare(a1.getWeight(), a2.getWeight());
		Comparator<Apple> byCountry = (a1, a2) -> a1.getCountry().compareTo(a2.getCountry());
		Comparator<Apple> byWeightAndThenByCountry = byWeight.thenComparing(byCountry); //
		inventory.sort(byWeightAndThenByCountry);
		inventory.forEach(a -> System.out.println(a));

		// ---------------------------------------------------

		Predicate<Apple> redApple = a -> a.getColor().equals(Color.RED);
		Predicate<Apple> heavyApple = a -> a.getWeight() > 150;
		Predicate<Apple> redAndHeavy = redApple.and(heavyApple);

		// ---------------------------------------------------------

		Predicate<Integer> isMin = n -> n > 100;
		Predicate<Integer> isMax = n -> n < 1000;

		int n = 500;

		Predicate<Integer> and = hof(isMin, isMax);

		boolean r = and.test(n);
		System.out.println(r);

	}

	// Higher-Order-Function
	public static Predicate<Integer> hof(Predicate<Integer> f1, Predicate<Integer> f2) {
		return n -> f1.test(n) && f2.test(n);
	}

}
