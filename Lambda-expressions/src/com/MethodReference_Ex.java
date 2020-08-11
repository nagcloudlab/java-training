package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Util {
	public boolean isEmpty(String s) {
		return s.isEmpty();
	}
}

public class MethodReference_Ex {

	public static void main(String[] args) {

		Util util = new Util();
		boolean b = util.isEmpty("cts");
		
		//------------------------------------
		
		
		List<String> strings=new ArrayList<String>();
		strings.add("item-1");
		strings.add("");
		strings.add("item-2");
		
		
		Predicate<String> predicate=util::isEmpty;
		//
		strings
		//.removeIf(s->util.isEmpty(s));
		.removeIf(predicate); // method reference
		

		strings
		//.forEach(str->System.out.println(str));
		.forEach(System.out::println);
		
		//-----------------------------------------
	}

}
