/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.DoctorRole;
import business.rolespkg.DonorRole;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class DoctorOrga extends Orga {
    
     public DoctorOrga()
    {
        super(Orga.Type.Doctor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
