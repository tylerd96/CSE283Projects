import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HTTPHTMLHandler {
	public static void main(String[] args) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress(1234),0);
		server.createContext("/index.html", new HomePageHandler());
		server.start();
		
	}
	
	public static class HomePageHandler implements HttpHandler {

		@Override
		public void handle(HttpExchange arg0) throws IOException {
			String text = "hai";
			arg0.sendResponseHeaders(200, text.length());
			OutputStream out = arg0.getResponseBody();
			
			out.write(text.getBytes());
			out.close();
		}
		
	}
}
