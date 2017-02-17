import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String args[]) throws IOException {
		ServerSocket welcomeSocket = new ServerSocket(1234);
		Socket connSocket = welcomeSocket.accept();
		
		PrintWriter out = new PrintWriter(connSocket.getOutputStream()); // Just a byte stream
		out.print("Hello, welcome to CSE283\nYou are in Section B");
		
		out.close();
		connSocket.close();
		welcomeSocket.close();
	}
	
}
