package collections;

import java.util.Map;
import java.util.TreeMap;

public class Map_Colln_Ex {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "JAVA");
		map.put(102, "JEE");
		map.put(103, "SPRING");

		String sub = map.get(101);
		System.out.println(sub);

	}

}
