package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example6 {
	
	public static void main(String[] args) {
		
		List<Dish> menu = Dish.menu; 
		
		menu
		.stream()
		.map(d->d.getName())
		.map(name->name.toUpperCase())
		.forEach(d->System.out.println(d));
		
		
		List<Integer> numbers=List.of(1,2,3);
		
		// (1 1 1) (2 4 8) (3 9 27) => 1 1 1 2 4  8 3 9 27
		
		numbers
		.stream()
		.flatMap(n-> Stream.of(n,n*n,n*n*n) )
		.filter(n->n>10)
		.forEach(System.out::println);
		
		
		String[] csvReport= {
				"A,IT,1000",
				"B,HR,3000",
				"C,SALES,3000",
				"D,IT,4000"
				};
		
		
		Arrays.stream(csvReport)
		.map(record->record.split(",")[1])
		.distinct()
		.forEach(System.out::println);
		
		
	}

}
