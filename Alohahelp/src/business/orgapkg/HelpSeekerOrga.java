/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.rolespkg.AdminRole;
import business.rolespkg.HelpSeekerRole;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class HelpSeekerOrga extends Orga{
    
    public HelpSeekerOrga()
    {
        super(Orga.Type.HelpSeeker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelpSeekerRole());
        return roles;
    }
    
}
