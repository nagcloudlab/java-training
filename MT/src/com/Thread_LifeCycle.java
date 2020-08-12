package com;

public class Thread_LifeCycle {

	public static void main(String[] args) {

		// Ready-To-Rin --> Running
		Runnable runnable = () -> {
			Thread thread = Thread.currentThread();
			for (int i = 0; i < 1000; i++) {
				System.out.println(thread.getName() + " -> " + i);
				// Running --> Not-Ready-Run ( sleep | wait | block )
			}
		}; // Running --> Dead

		Thread thread1 = new Thread(runnable, "T1"); // New
		Thread thread2 = new Thread(runnable, "T2");

		//
		thread1.start(); // New --> Runnable / Ready-To-Run
		thread2.start();

	}

}
