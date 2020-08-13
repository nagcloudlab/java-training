package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {

		try {
			ServerSocket serverSocket = new ServerSocket(8080);

			ExecutorService executorService = Executors.newCachedThreadPool();

			while (true) {
				System.out.println("waiting for request..");
				Socket socket = serverSocket.accept();
				Runnable task = () -> {
					try {
						OutputStream os = socket.getOutputStream();
						ObjectOutputStream oos = new ObjectOutputStream(os);
						Thread.sleep(5000);
						oos.writeObject("hello client, welcome");
						oos.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
				};

				executorService.submit(task);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
