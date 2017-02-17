/*
 * Name: Tyler Davis
 * Unique ID: davistj7
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("127.0.0.1",1234);
		InputStream is = client.getInputStream();
		FileOutputStream output = new FileOutputStream(args[0]);
		
		int b = is.read();
		while(b != -1) {
			output.write(b);
			b = is.read();
		}

		output.close();
		is.close();
		client.close();
		
	}
}
