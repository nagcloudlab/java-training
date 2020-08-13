package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {

//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		System.out.println("enter ur name");
//		String name = br.readLine();
//		System.out.println(name);
//		br.close()

		// or

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter ur name");
		String name = scanner.nextLine();
		System.out.println(name);
		scanner.close();
	}

}
