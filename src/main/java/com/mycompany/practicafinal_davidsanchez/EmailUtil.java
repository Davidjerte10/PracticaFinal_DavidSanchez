/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinal_davidsanchez;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Alumno
 */
public class EmailUtil {
    public static void sendEmail(Session session, String toEmail, String subject, String body) {
    try {
        
     MimeMessage msg = new MimeMessage(session);
     msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
     msg.addHeader("format", "flowed");
     msg.addHeader("Content-Transfer-Encoding", "8bit");
     msg.setFrom(new InternetAddress("davidjerte10@gmail.com", "David Gym"));
     msg.setReplyTo(InternetAddress.parse("davidjerte10@gmail.com", false));
     msg.setSubject(body, "UTF-8");
     msg.setText(body, "UTF-8");
     msg.setSentDate(new Date());
     msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
     System.out.println("El mensaje está listo");
     Transport.send(msg);
     System.out.println("Email enviado correctamente");
     
    } catch (UnsupportedEncodingException | MessagingException e) {
    }
  }
}
