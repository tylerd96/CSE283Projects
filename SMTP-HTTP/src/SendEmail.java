import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void main(String[] args) throws MessagingException {
		Properties prop = System.getProperties();
		prop.setProperty("mail.smtp.host", "172.24.53.208");
		prop.setProperty("mail.smtp.port", "1234");
		
		Session ssin = Session.getDefaultInstance(prop);
		
		MimeMessage msg = new MimeMessage(ssin);
		msg.setFrom("ddd@fff.com");
		msg.addRecipients(Message.RecipientType.TO, "userthatisreceivingthisemail@utirte.com");
		msg.setText("Hello CSE283, I am Tyler Davis");
		
		System.out.println("Your email is being sent.");
		Transport.send(msg);
		System.out.println("Email sent successfully :)");
	}
}
