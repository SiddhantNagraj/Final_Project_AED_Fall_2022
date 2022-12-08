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
public class Supervisor extends Organization {
     
    public Supervisor()
    {
        super(Organization.Type.Supervisor.getValue());
    }
    
    // @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupervisorRole());
       // roles.add(new HeartHelpManagerRole());
        return roles;
    }
}
