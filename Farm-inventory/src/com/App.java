package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.model.Apple;
import com.model.Color;

// coping with changing requirements

public class App {
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(
				new Apple(80, Color.GREEN), 
				new Apple(155, Color.GREEN),
				new Apple(120, Color.RED));
		
		
//		List<Apple> greenApples=filterApples(inventory, new AppleGreenColorPredicate());
//		System.out.println(greenApples);
//		List<Apple> heavyApples=filterApples(inventory, new AppleHeavyWeightPredicate());
//		System.out.println(heavyApples);
//		List<Apple> redAndheavyApples=filterApples(inventory,new AppleRedColorAndHeavyPredicate());
//		System.out.println(redAndheavyApples);
//		
		
		//#5 Fifth Attempt
//		List<Apple> greenApples = filterApples(inventory, new ApplePredicate() {
//			public boolean test(Apple apple) {
//				return apple.getColor().equals(Color.GREEN);
//			}
//		});
//		System.out.println(greenApples);
//		List<Apple> heavyApples=filterApples(inventory, new ApplePredicate() {
//			@Override
//			public boolean test(Apple apple) {
//				return apple.getWeight()>150;
//			}
//		});
//		System.out.println(heavyApples);
		
		//#6 Lambda Expressions / Function  ( from Java-8 )
		List<Apple> greenApples=filterApples(inventory,apple->apple.getColor().equals(Color.GREEN));
		System.out.println(greenApples);
		List<Apple> heavyApples=filterApples(inventory, apple->apple.getWeight()>150);
		System.out.println(heavyApples);
		
		List<Apple> redAndheavyApples=filterApples(inventory, apple->apple.getColor().equals(Color.RED) && apple.getWeight()>150);
		
	}
	
	// #1 First Attempt
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result=new ArrayList<Apple>();
		for(Apple apple:inventory) {
			if(apple.getColor().equals(Color.GREEN))
				result.add(apple);
		}
		return result;
	}
	
	// #2 Second Attempt
	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (apple.getColor().equals(color))
				result.add(apple);
		}
		return result;
	}
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight)
				result.add(apple);
		}
		return result;
	}
	
	// DRY ==> DONOT REAPEAT YOURSELF
	
	
	// #3 Third Attempt
	public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (flag && apple.getColor().equals(color) || !flag && apple.getWeight() > weight)
				result.add(apple);
		}
		return result;
	}
	
	
	//#4 Fourth Attempt ==> behavior parameterization i.e  strategy design patterns
	public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate applePredicate) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (applePredicate.test(apple))
				result.add(apple);
		}
		return result;
	}
	
	
	// #7 Seventh Attempt  - Generic Function
//	public static <E> List<E> filterApples(List<E> inventory,Predicate<E> predicate) {
//		List<E> result = new ArrayList<E>();
//		for (E apple : inventory) {
//			if (predicate.test(apple))
//				result.add(apple);
//		}
//		return result;
//	}
	

}


@FunctionalInterface
interface ApplePredicate{
	boolean test(Apple apple);
}


class AppleGreenColorPredicate implements ApplePredicate{
	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals(Color.GREEN);
	}
	
}

class AppleHeavyWeightPredicate implements ApplePredicate{
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight()>150;
	}
}

class  AppleRedColorAndHeavyPredicate implements ApplePredicate{
	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals(Color.RED) && apple.getWeight()>150;
	}
}