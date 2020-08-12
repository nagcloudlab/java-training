package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Colln_Ex {

	public static void main(String[] args) {

//		Set<String> set = new TreeSet<String>();
//		Set<String> set = new HashSet<String>();
		Set<String> set = new LinkedHashSet<String>();
		set.add("A");
		set.add("C");
		set.add("B");
		set.add("E");
		set.add("G");
		set.add("F");
		set.add("A");
		set.add("Z");
		set.add("P");
		
		System.out.println(set);

	}

}
