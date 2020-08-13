package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class App {
	public static void main(String[] args) {

		try {
			Socket socket = new Socket("127.0.0.1", 8080);

			InputStream inputStream = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(inputStream);
			Object message = ois.readObject();

			System.out.println(message);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
