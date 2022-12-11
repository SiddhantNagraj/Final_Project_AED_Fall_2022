/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.HeartHelpManagerRole;
import business.rolespkg.Role;
import business.rolespkg.SupervisorRole;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class SupervOrga extends Orga {
    
    public SupervOrga()
    {
        super(Orga.Type.Supervisor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupervisorRole());
        roles.add(new HeartHelpManagerRole());
        return roles;
    }
    
    
}
