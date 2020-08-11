package com;

import java.util.function.Consumer;

public class Q {

	public static void main(String[] args) {

		Consumer<String> consumer = System.out::println;
		consumer.accept("hello");

	}

}
