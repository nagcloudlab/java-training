package example;

import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		// External vs Internal iteration

		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// External iteration
		for (Integer integer : integers) {
			System.out.println(integer);
			// filter
			// sort
			// transformation
			// limit
		}
		
		System.out.println();

		// Internal iteration
		integers
		.stream()
		.parallel()
		.filter(n->n%2==0)
		.forEach(System.out::println);

	}

}
