package com;

@FunctionalInterface
interface Comparator {
	int compare(String s1, String s2);
}

public class Lambda_Syntax {

	public static void main(String[] args) {

//		Comparator comaparator = (String s1, String s2) -> {
//			int diff=s1.compareTo(s2);
//			return diff;
//		};
//
//		Comparator comaparator = (s1, s2) -> {
//			int diff = s1.compareTo(s2);
//			return diff;
//		};
//
//		Comparator comaparator = (s1, s2) -> {
//			return s1.compareTo(s2);
//		};

		Comparator comaparator = (s1, s2) -> s1.compareTo(s2);
		int r = comaparator.compare("a", "b");
		System.out.println(r);

	}

}
