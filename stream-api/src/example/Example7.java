package example;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

	public static void main(String[] args) {
		
		List<Dish> menu = Dish.menu;

		
		System.out.println(
				
				// Build stream
				menu
				.stream()
				// intermediate operations
//				.filter(dish->dish.getCalories()<1000)
//				.forEach(dish->System.out.println(dish));
//				.count()
//				.mapToInt(Dish::getCalories)
//				.sum()
//				.average()
//				.min()
//				.max()
//				.findFirst()
//				.findAny()
//				.allMatch(dish->dish.getCalories()<200)
//				.anyMatch(dish->dish.getCalories()<200)
//				.noneMatch(dish->dish.getCalories()>1000)
				.map(Dish::getName)
				.reduce("", (s,name)->s+name)
//				.collect(Collectors.toList())
				
				
				
		);
		
	}
	
}
