/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.MayorRole;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class MayorOrga extends Orga {
    
     public MayorOrga()
    {
        super(Orga.Type.Mayor.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MayorRole());
        return roles;
    }
    
}
