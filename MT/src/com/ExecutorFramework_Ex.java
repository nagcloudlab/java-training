package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// From JDK 1.5

/*
 * 
 *  how many threads can i create ?
 *  
 *  s/w
 *  
 *  -> computation intensive 
 *  -> io intensive
 *  
 *  
 *                   # of cpus  ( 8 )
 *  # of threads <= --------------------------------
 *                   blocking-factor ( 1 )  ( 0.5 )
 *            
 *                   
 *    0  < blocking-factor  < 1             
 * 
 * 
 * 
 * -------------------------------------------------
 * 
 * 
 * imp-note : 
 * 
 * we should isolate thread management from real code , use 'ExecutorService'
 * 
 *   
 * 
 */

public class ExecutorFramework_Ex {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			Runnable task = () -> {
				String name = Thread.currentThread().getName();
				System.out.println(name + " -> hello ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + " -> bye ");
			};
			executorService.submit(task);

		}

	}

}
