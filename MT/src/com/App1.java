package com;

import java.util.Scanner;

/*
 * 
 *  s/w
 *  
 *  2 types tasks
 *  
 *  task-1 : computation
 *  task-2 : IO
 * 
 * 
 */

public class App1 {

	public static void computation() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started computation");
		while (true) {
		}
//		System.out.println(threadName + " finished computation");
	}

	public static void io() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started IO");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scanner.nextLine();
		System.out.println("hello " + name);
		scanner.close();
		System.out.println(threadName + " finished IO");

	}

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().availableProcessors());

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " initiated execuation");
		io(); // blocking-IO , i.e current thread blocked on IO
		computation();
		System.out.println(threadName + " finished execuation");
	}

}
