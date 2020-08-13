package com;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTask_Ex {

	public static void main(String[] args) {

		Random random = new Random();

		Callable<Integer> task = () -> {
			Thread.sleep(3000);
			return random.nextInt();
		};

		ExecutorService executorService = Executors.newFixedThreadPool(8);
		Future<Integer> future = executorService.submit(task);

		try {
			Integer integer = future.get();
			System.out.println(integer);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
