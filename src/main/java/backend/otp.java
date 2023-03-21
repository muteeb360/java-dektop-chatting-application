/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package backend;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class otp {

    static int otp;
    static int compare_otp;
    static Instant expirationTime;
    static Instant check_expirationTime;

    private static void generateOtp() {
        SecureRandom random = new SecureRandom();
        otp = 100000 + random.nextInt(900000);
        System.out.println("otp is "+otp);
        expirationTime = Instant.now().plus(Duration.ofMinutes(5));
        compare_otp = otp;
        check_expirationTime = expirationTime;
    }

    public static Instant acquireTime() {
        return check_expirationTime;
    }

    public static int acquireOtp() {
        return compare_otp;
    }

    public static void sendOtp(String recipent) {
        generateOtp();
        final String username = "chatmateotp@gmail.com";
        final String password = "excwupuymtzmtbyp";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("chatmateotp@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipent)
            );
            message.setSubject("CHAT MATE OTP");
            message.setText("Dear User," + "\n\n Your OTP is " + otp + "\nIt's expiration time is 5 minutes");

            Transport.send(message);

            System.out.println("Email sent");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
