
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressResolution {
	public static void main(String args[]) throws UnknownHostException { 
		InetAddress addr = InetAddress.getByName("localhost");
		System.out.println("The IP address is: " + addr.getHostAddress());
	}
}
