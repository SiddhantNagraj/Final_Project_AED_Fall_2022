/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.Role;
import business.rolespkg.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class VolunteerOrga extends Orga {
    
    public VolunteerOrga()
    {
        super(Orga.Type.Volunteer.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VolunteerRole());
        return roles;
    }
}
