import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class FindingNetworkInterface {
	public static void main(String args[]) throws SocketException {
		Enumeration<NetworkInterface> ni = NetworkInterface.getNetworkInterfaces();
		while(ni.hasMoreElements()) {
			NetworkInterface cur = ni.nextElement();
			Enumeration<InetAddress> nip = cur.getInetAddresses();
			while(nip.hasMoreElements()) {
				InetAddress tmp = nip.nextElement();
				if(tmp instanceof Inet4Address) {
					System.out.println("IP address is: "+tmp);
				}
				
			}
		}
	}
}
