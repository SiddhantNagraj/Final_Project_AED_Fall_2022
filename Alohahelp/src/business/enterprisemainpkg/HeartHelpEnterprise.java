/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisemainpkg;

import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class HeartHelpEnterprise extends Enterprise{

    @Override
    public ArrayList<Role> getSupportedRole() {
    return null;
    }
    
    public HeartHelpEnterprise(String name)
    {
     super(name, Enterprise.EnterpriseType.HeartHelp);  
    }
    
    
}
