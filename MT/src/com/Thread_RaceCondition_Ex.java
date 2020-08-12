package com;

class CounterBox {
	
	long count = 0; // mutable

	public synchronized void increment() {            
		count = count + 1; // read => increment ==> write 
	}

	public long get() {
		return count;
	}
}

public class Thread_RaceCondition_Ex {

	public static void main(String[] args) throws InterruptedException {

		CounterBox counterBox = new CounterBox(); // shared resource

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counterBox.increment();
			}
		};

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(task);
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		System.out.println(counterBox.get()); // 1000 * 1000 => 1000000
	}

}
