package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.model.Apple;
import com.model.Color;

public class HOP {

	// Higher-Order-Function
	public static Predicate<Integer> hof(Predicate<Integer> f1, Predicate<Integer> f2) {
		Predicate<Integer> predicate = n -> {
			return f1.test(n) && f2.test(n);
		};
		return predicate;
	}

	public static void main(String[] args) {

		List<Apple> inventory = new ArrayList<Apple>();
		inventory.add(new Apple(80, Color.GREEN, "INDIA"));
		inventory.add(new Apple(155, Color.GREEN, "US"));
		inventory.add(new Apple(80, Color.GREEN, "AUS"));

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

		// ----------------------------------------------------------

		/*
		 * 
		 * x=10
		 * 
		 * f(x) ==> x+10
		 * 
		 * g(x) ==> x*10
		 * 
		 * 
		 * f(g(x))
		 * 
		 * 
		 */

		Function<Integer, Integer> f = x -> x + 10;
		Function<Integer, Integer> g = x -> x * 10;

//		int v=g.apply(10);
//		int result=f.apply(v);
//		System.out.println(result);
		// or
		Function<Integer, Integer> fg = f.compose(g); // HOF ==> HOP
		System.out.println(fg.apply(10));

	}

	public void method(int... args) {

	}

}
