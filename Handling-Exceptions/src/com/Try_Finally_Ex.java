package com;

import java.io.Closeable;

/*
 * 
 *  resource objects 
 *  
 *    e.g file, socket, db connection
 * 
 */

class Resource implements Closeable {
	public Resource() {
		System.out.println("Resource init....");
	}

	public void use() {
		System.out.println("Resource use...");
//		throw new IllegalStateException("oops");
	}

	public void close() {
		System.out.println("Resource close...");
	}
}

public class Try_Finally_Ex {

	public static void main(String[] args) {

		Resource resource = new Resource();
		try (resource){
			resource.use();
			return;
//			resource.close();
		} catch (Exception e) {
			System.out.println("Ex : " + e.getMessage());
//			resource.close();
		} 
//		finally {
//			resource.close();
//		}

		
//		try {
//			
//		}
//		finally {
//			
//		}
	}

}
