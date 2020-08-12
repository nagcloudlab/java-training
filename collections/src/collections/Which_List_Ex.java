package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Which_List_Ex {

	public static void doSomething(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add("item-" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	public static void main(String[] args) {

		
		List<String> vector = new Vector<String>();
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList=new LinkedList<String>();
		
		
		doSomething(vector);
		doSomething(arrayList);
		doSomething(linkedList);
		

	}

}
