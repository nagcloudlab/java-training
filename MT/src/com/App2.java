package com;

import java.util.Scanner;

public class App2 {

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

		Thread ioThread = new Thread(() -> {
			io(); // blocking-IO , i.e current thread blocked on IO
		}, "IO-THREAD");

		Thread computationThread = new Thread(() -> {
			computation();
		}, "COMPUTATION-THREAD");

		ioThread.start(); // creates separate stack memory , to cont... execution
		computationThread.start();

		System.out.println(threadName + " finished execuation");

	}
}
