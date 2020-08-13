package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"/Users/nag/Downloads/Modern Java in Action - Lambda, streams, functional and reactive programming.pdf");
		FileInputStream fis = new FileInputStream(file);
		byte[] fileData = new byte[(int) file.length()];
		fis.read(fileData);
		fis.close();

		FileOutputStream fos = new FileOutputStream("modern-java.pdf");
		fos.write(fileData);
		fos.close();

		System.out.println("copied..");

	}

}
