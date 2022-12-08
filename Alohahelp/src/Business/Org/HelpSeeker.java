 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Org;

import java.util.ArrayList;

/**
 *
 * @author shiba
 */
public class HelpSeeker extends Organization{
    
    public HelpSeeker()
    {
        super(Organization.Type.HelpSeeker.getValue());
    }
    
   // @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HelpSeekerRole());
        return roles;
    }
}
