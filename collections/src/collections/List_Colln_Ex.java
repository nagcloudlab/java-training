package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Colln_Ex {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("veg-1");
		list.add("veg-2");
		list.add("veg-4");
		list.add("veg-2");
		list.add("veg-5");
		list.add("veg-6");

		// How to iterate list collections?

		// way-1: traditional for loop
//		for (int i = 0; i < list.size(); i++) {
//			String item = list.get(i);
//			System.out.println(item);
//		}

//		way-2: iterator pattern , collection itself contains iteration logic
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String item = (String) iterator.next();
//			System.out.println(item);
//		}

//		ListIterator<String> listIterator = list.listIterator();
//		while (listIterator.hasNext()) {
//			String string = (String) listIterator.next();
//			System.out.println(string);
//		}
//		while (listIterator.hasPrevious()) {
//			String string = (String) listIterator.previous();
//			System.out.println(string);
//		}

		// way-3 : for-each loop ( 1.5 )
//		for (String item : list) {
//			System.out.println(item);
//		}

		// way-4:
		list.forEach(System.out::println);

	}

}
