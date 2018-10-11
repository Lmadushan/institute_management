import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class SendMail {

    public static void mail(String id, String Name, String Email, String sub1, String res1, String sub2, String res2, String sub3, String res3, String sub4, String res4, String sub5, String res5, String sub6, String res6) {
                
        
        
        final String username = "lahiruthebest1@gmail.com";
        final String password = "0757588004";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            MyFunction mf = new MyFunction();
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lahiruthebest1@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(Email));
            message.setSubject("Subject Results");
            message.setText("Dear "+Name+" ("+id+"),\n\n Your exam results are"
                    + "\n\n Result - Subject"
                    + "\n\n"+sub1+" - "+res1
                    + "\n\n"+sub2+" - "+res2
                    + "\n\n"+sub3+" - "+res3
                    + "\n\n"+sub4+" - "+res4
                    + "\n\n"+sub5+" - "+res5
                    + "\n\n"+sub1+" - "+res1
                    +"\n\n Examination Department");

            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Email Sent!!!");
            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}