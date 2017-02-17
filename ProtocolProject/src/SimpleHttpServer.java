import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(1234);
		Socket childServer = server.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(childServer.getInputStream()));
		/*String ip = br.readLine();
		while(!ip.isEmpty()) {
			System.out.println(ip);
			ip = br.readLine();
		}*/
		
		childServer.getOutputStream().write("HTTP/1.1 200 OK\n\r\n\r The Falcons blew a 25pt lead...".getBytes());
		childServer.close();
		server.close();
	}
}
