package com.ironhack.contactservice.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

//@Configuration
public class Email {

//    @Bean
//    public JavaMailSender javaMailService() {
//        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//
//        javaMailSender.setHost("smtp.gmail.com");
//        javaMailSender.setPort(587);
//
//        javaMailSender.setJavaMailProperties(getMailProperties());
//
//        return javaMailSender;
//    }
//
//    private Properties getMailProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("mail.transport.protocol", "smtp");
//        properties.setProperty("mail.smtp.auth", "true");
//        properties.setProperty("mail.smtp.starttls.enable", "true");
//        properties.setProperty("mail.debug", "false");
//        return properties;
//    }

//    public static void sendWithGMail(String body) {
//        // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
//        String remitente = "dronedelirium.info";  //Para la dirección nomcuenta@gmail.com
//        String issue = "Drone Delirium Contact";
//
//        Properties props = System.getProperties();
//        props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
//        props.put("mail.smtp.user", remitente);
//        props.put("mail.smtp.clave", "Dronedelirium!");    //La clave de la cuenta
//        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
//        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
//        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
//
//        Session session = Session.getDefaultInstance(props);
//        MimeMessage message = new MimeMessage(session);
//
//        try {
//            message.setFrom(new InternetAddress(remitente));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(remitente));   //Se podrían añadir varios de la misma manera
//            message.setSubject(issue);
//            message.setText(body);
//            Transport transport = session.getTransport("smtp");
//            transport.connect("smtp.gmail.com", remitente, "Dronedelirium!");
//            transport.sendMessage(message, message.getAllRecipients());
//            transport.close();
//        }
//        catch (MessagingException me) {
//            me.printStackTrace();   //Si se produce un error
//        }
//    }

//    public static void main(String body) {
//
//        final String username = "dronedelirium.info@gmail.com";
//        final String password = "Dronedelirium!";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("dronedelirium.info@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse("dronedelirium.info@gmail.com"));
//            message.setSubject("Testing Subject");
//            message.setText("Dear Mail Crawler,"
//                    + "\n\n No spam to my email, please!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
