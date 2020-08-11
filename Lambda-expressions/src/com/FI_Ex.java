package com;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FI_Ex {

	public static void main(String[] args) {

		Function<String, Integer> function1 = s -> s.length() + 100;
		ToIntFunction<String> toIntFunc = s -> s.length() + 100;
		Function<Integer, String> function2 = i -> String.valueOf(i);
		BiFunction<Integer, Integer, String> biFunction = (n1, n2) -> String.valueOf(n1 + n2);
		Predicate<String> predicate1 = s -> s.isEmpty();
		Consumer<String> consumer = s -> System.out.println(s);
		Supplier<String> supplier = () -> "Nag";
		UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
		BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;
		IntBinaryOperator intBinaryOperator = (n1, n2) -> n1 + n2;

		// -----------------------------------------------------------
//		
//		int v=12; // value 
//		Integer obj=v;  // boxing

		// ------------------------------------------------------------

//		int r=binaryOperator.apply(12, 13);
//		System.out.println(r);

	}

}
