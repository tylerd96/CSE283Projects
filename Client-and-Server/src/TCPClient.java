import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String args[]) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost",1234);
		Scanner input = new Scanner(client.getInputStream());
		
		System.out.println(input.nextLine());
		System.out.println(input.nextLine());
		
		
		client.close();
		input.close();
	}
}
