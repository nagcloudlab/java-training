package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.model.Apple;
import com.model.Color;

import static java.util.Comparator.comparing;

public class Final_Ex {

	public static void main(String[] args) {

		List<Apple> inventory = new ArrayList<Apple>();
		inventory.add(new Apple(80, Color.GREEN, "INDIA"));
		inventory.add(new Apple(155, Color.GREEN, "US"));
		inventory.add(new Apple(80, Color.GREEN, "AUS"));

//		java.util.Comparator<Apple> byWeight=(a1,a2)->Integer.compare(a1.getWeight(), a2.getWeight());
//		java.util.Comparator<Apple> byWeight = comparing(apple -> apple.getWeight());
//		java.util.Comparator<Apple> byWeight = comparing(Apple::getWeight);
//		inventory.sort(byWeight);

//		inventory
//		.sort(comparing(Apple::getWeight));
//		inventory
//		.forEach(System.out::println);

//		inventory
//		.stream()
//		.sorted(comparing(Apple::getWeight))
//		.forEach(System.out::println);

		// imperative style
//		inventory
//		.sort(new Comparator<Apple>() {
//			@Override
//			public int compare(Apple o1, Apple o2) {
//				return Integer.compare(o1.getWeight(), o2.getWeight());
//			}
//		});
//		
//		for(Apple apple:inventory) {
//			System.out.println(apple);
//		}

	}

}
