package com;

class Employee {
	public void work() {
		System.out.println("emp working");
	}
}

public class Try_Catch_Ex {

	public static void main(String[] args) {
		System.out.println("A");
		try {
			System.out.println("B");
			int ari = 1 / 1;
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[1]);
			Employee employee = null;
			employee.work();
			System.out.println("C");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Arr/Arith Ex :" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ex :" + e.getMessage());
		}
		System.out.println("D");

	}

}
