/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.cmn;


import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author revat
 */
public class SendEmailAndTextMessage {
 
    private static final String smtpHostName = "smtp.gmail.com"; 
    private static final String smtpPortNo = "587"; 
     private static StringBuilder emailMsgTxt ;
        
        private static String emailSubText = "Thank you!";
        private static String emailFromAdd = "alohahelpcare@gmail.com";
        private static String pass2="zkpjsjvgkkknfsng";
    

    public static String generatePassword(String name)
    {
        try
        {
      Random random = new Random();
      String value = String.valueOf(random.nextInt(10000));
      String value1 = String.valueOf(random.nextInt(100));
        StringBuilder sb = new StringBuilder();
        sb.append(value1);
        sb.append(name);
        sb.append(value);
        System.out.println(">>>>password>>>>>"+sb.toString());
         return sb.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
    
    public static String generateUserName(String name)
    {
        try
        {
      Random random = new Random();
      String value1 = String.valueOf(random.nextInt(100));
        StringBuilder sb = new StringBuilder();
        sb.append(value1);
        sb.append(name);
        System.out.println(">>>>username>>>>"+sb.toString());
         return sb.toString();
    }
     catch(Exception e)
        {
            
        }
        return null;
    }
      

 // Send Email                   
    
    public static boolean sendEmail(String msg, String emailId, String userName, String password) throws Exception
    {
        System.out.println("Preparing to send email");
      boolean isSent = true;
 
    try {
     Properties props =new Properties();
     props.put("mail.smtp.user",emailFromAdd );
        props.put("mail.smtp.host", smtpHostName);                                                        
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.password",password);
        props.put("mail.smtp.port", "465");
        props.setProperty ("mail.smtp.ssl.enable", "true");
        props.setProperty ("mail.smtp.localhost", "localhost"); // added this line
        props.setProperty ("mail.debug", "true"); // added this line
       // props.put("mail.smtp.socketFactory.port", "465");
        //props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //props.put("mail.smtp.socketFactory.fallback", "false");
        
   System.out.println("debug 1");
        Session mailSession = Session.getInstance(props,new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(emailFromAdd,pass2);
            }
        });
        System.out.println("debug 2");
        Message message = new MimeMessage(mailSession);
        System.out.println("debug 3");
         InternetAddress fromAddress ;
        InternetAddress toAddress;
        try
           {
         fromAddress = new InternetAddress(emailFromAdd);
         toAddress = new InternetAddress(emailId);
         }
        
        catch (AddressException ae) {
            ae.printStackTrace();
         isSent= false;
         System.out.println("catch 1");
         return isSent;
         }
        System.out.println("debug 4");
        
        message.setFrom(fromAddress);
        message.setRecipient(RecipientType.TO, toAddress);
        System.out.println("debug 5");
        message.setSubject(emailSubText);
        message.setText(msg);
 System.out.println("debug 6");
        Transport transport =mailSession.getTransport("smtps");
        System.out.println("debug 7");
       //transport.connect(smtpHostName,465,emailFromAdd, pass2);
       System.out.println("debug 8");
       
       transport.send(message);
       System.out.println("debug 9");
       transport.close();
       System.out.println("Email Sent !");
       isSent=true;
        } 
         catch (MessagingException mex) {
            isSent=false;
            System.out.println("catch 2");
            return isSent;
       }


         return isSent;
     
    }
    
   
}

