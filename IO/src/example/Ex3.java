package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex3 {

	public static void main(String[] args) {

		File file = new File("new-menu.txt");
		try {
//			file.createNewFile();

			FileWriter fileWriter = new FileWriter(file,true);
			PrintWriter writer = new PrintWriter(fileWriter);
			writer.println("line-1");
			writer.println("line-2");
			writer.flush();
			writer.println("line-3");
			writer.close();
			writer.println("line-4");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
