package example;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		
		List<Dish> menu = Dish.menu;// collection
		
		//..
		// till java 7  ( imperative style )
		List<Dish> lowCaloricDishes = new ArrayList<Dish>();
		for (Dish dish : menu) {
			if (dish.getCalories() < 400) {
				lowCaloricDishes.add(dish);
			}
		}
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		List<String> lowCaloricDishesName = new ArrayList<String>();
		for (Dish dish : lowCaloricDishes) {
			lowCaloricDishesName.add(dish.getName());
		}
		for (String name : lowCaloricDishesName) {
			System.out.println(name);
		}
		
		

		/*
		 * 
		 * --> imperative style   ( what + how mixed together )
		 * --> many mutable variables
		 * --> difficult to apply concurrent/parallel execution
		 * 
		 */
		
		// in java-8 : using stream api  ( declarative style )
		
		lowCaloricDishesName=
				menu
				.stream()
				.parallel()
				.filter(d->d.getCalories()<400)
				.sorted(comparing(Dish::getCalories))
				.map(Dish::getName)
				.collect(Collectors.toList());
				
		
		lowCaloricDishesName
		.forEach(System.out::println);
				
				
				
		
	}

}
