package example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) {

		File file = new File("menu.txt");
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.exists());
//		System.out.println(file.length());
//	

		try {

//			FileInputStream fis = new FileInputStream(file);
////			int ch = -1;
////			while ((ch = fis.read()) != -1) {
////				System.out.print((char)ch);
////			}
//			InputStreamReader isr = new InputStreamReader(fis);
//			BufferedReader br = new BufferedReader(isr);
//			String line = null;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//			fis.close();

			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			fileReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
