import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Enumeration;

public class Tester {
	public static void main(String args[]) throws UnknownHostException, SocketException {
//		System.out.println(NetworkInterface.getByName("127.0.0.1"));
//		System.out.println(Calendar.getInstance().getCalendarType());
		
		Enumeration<NetworkInterface> ni = NetworkInterface.getNetworkInterfaces();
		while(ni.hasMoreElements()) {
			NetworkInterface cur = ni.nextElement();
			System.out.println(cur.getDisplayName());
		}
	}
}
