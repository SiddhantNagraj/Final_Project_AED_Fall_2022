/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.cmn;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author revat
 */
public class EmailAuthenticator extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "Alohahelpbyvolunteer@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "helpbyvolunteer"; 
    
           @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username, password);                                             
    }  
                
}
