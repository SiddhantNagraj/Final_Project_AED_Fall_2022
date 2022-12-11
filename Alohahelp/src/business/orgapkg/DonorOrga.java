/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.DonorRole;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class DonorOrga extends Orga{
    
      public DonorOrga()
    {
        super(Orga.Type.Donor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DonorRole());
        return roles;
    }
    
}
