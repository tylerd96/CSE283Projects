/*
 * Name: Tyler Davis
 * Unique ID: davistj7
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
	private ServerSocket server=null;
	private Socket child=null;
    public Server(ServerSocket a, Socket b){
    	this.server = a;
    	this.child = b;
    }
	@Override
	public void run() {
		//Implement your file byte read and other functionalities here
		FileInputStream is;
		System.out.println("Client process running");
		
		try {
			OutputStream stream = child.getOutputStream();
			is = new FileInputStream("sample.txt");
			int b = is.read();
			while(b != -1) {
				stream.write(b);
				b = is.read();
			}
			
			is.close();
			stream.close();
			child.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) throws IOException{
		ServerSocket ss = new ServerSocket(1234);

		while(true){
			Socket cc = ss.accept();
			Server ab = new Server(ss,cc);
			new Thread(ab).start();
		}
	}
}