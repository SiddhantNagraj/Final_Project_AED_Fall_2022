/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.DriverRole;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class TransportOrga extends Orga{
    
        public TransportOrga()
    {
        super(Orga.Type.Transport.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DriverRole());
        return roles;
    }
}
