package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example4 {

	public static void main(String[] args) {

		// # Traversable only once

//		List<String> titles = Arrays.asList("Modern", "Java", "In", "Action");
//
//		Stream<String> stream = titles.stream();
//		stream.forEach(System.out::println); // terminal

//		stream
//		.forEach(System.out::println);  // Exception
		
		
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Stream<Integer> streamEx=
				integers
				.stream()   // create stream
				// intermediate operations  i.e build pipeline  ( Lazy )
				.filter(n->{
					System.out.println("filtering number > 5 : "+n);
					return n>5;
				})
				.filter(n->{
					System.out.println("filtering for even : "+n);
					return n%2==0;
				})
				.map(n->n*n)
				.limit(2);
		
		
		streamEx
		.forEach(System.out::println);  // terminal operation
		
//		streamEx
//		.forEach(System.out::println);  // terminal operation
//		
		

	}

}
