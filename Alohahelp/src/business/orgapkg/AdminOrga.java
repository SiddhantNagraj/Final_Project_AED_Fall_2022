/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;


import business.rolespkg.AdminRole;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class AdminOrga extends Orga{

    public AdminOrga() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
     
}
