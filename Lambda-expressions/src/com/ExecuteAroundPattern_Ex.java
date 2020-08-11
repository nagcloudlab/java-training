package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@FunctionalInterface // annotation
interface BufferedReaderProcessor {
	void process(BufferedReader br);
}

public class ExecuteAroundPattern_Ex {

	public static void main(String[] args) throws Exception {

		// task-1 : read one menu item
		readFile(br -> {
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		// task-1 : read one menu item
		readFile(br -> {
			try {
				System.out.println(br.readLine() + "" + br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

	}

	private static void readFile(BufferedReaderProcessor processor) throws Exception {

		// prepare
		File file = new File("menu.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		// ..
		processor.process(br);

		// clean
		br.close();

	}

}
