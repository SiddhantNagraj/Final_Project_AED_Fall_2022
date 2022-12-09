/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.comm;

import java.net.Authenticator;
import java.net.PasswordAuthentication;


/**
 *
 * @author tejageetla
 */
public class EmailAuthenticator extends Authenticator{
    
    public static final String SMTP_AUTH_USER = "hearthelpbyvolunteer@gmail.com";                                 
    public static final String SMTP_AUTH_PWD  = "helpbyvolunteer"; 
    
          // @Override                                                                                                                   
    public PasswordAuthentication getPasswordAuthentication(char[] passwordd)                                             
    {                                                                                                                                      
        String username = SMTP_AUTH_USER;                                                                    
        String password = SMTP_AUTH_PWD;                                                                     
        return new PasswordAuthentication(username,passwordd);                                             
    }  
}        