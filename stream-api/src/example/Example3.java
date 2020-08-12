package example;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Example3 {
	
	public static void main(String[] args) {
		
		
		List<Dish> menu=Dish.menu;
		
		
		//
		List<String> threeHighCaloricDishNames=
				menu
				.stream() // stream-1
				.filter(dish->{ // stream-2
					System.out.println("F - "+dish.getName());
					return dish.getCalories()>300;
				})
				.map(dish->{   // stream-3
					System.out.println("M - "+dish.getName());
					return dish.getName();
				})
				.limit(2) // stream-4
				.collect(toList());
		
		System.out.println(threeHighCaloricDishNames);
		
	}

}
