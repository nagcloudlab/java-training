package com;

import java.util.Scanner;

public class ArithAppln {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N1");
		int n1 = scanner.nextInt();

		System.out.println("Enter N2");
		int n2 = scanner.nextInt();

		// 1. Add
		System.out.println("Add..");

		// 2. Sub
		System.out.println("Sub..");

		try {
			// 3.Div
			System.out.println("Div");
			int r = n1 / n2;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			/*
			 *  -> report user with friendly error message
			 *  -> log it for future fix
			 *  -> re propagate exception to other modules
			 *  -> release any externAL RESOURCES like IO streams , sockets , db connections
			 * 
			 */
			System.out.println(e.getMessage());

		}
		// 4. Mul
		System.out.println("Mul..");

		System.out.println("All is well");
		scanner.close();
	}

}
