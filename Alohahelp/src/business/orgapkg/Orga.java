/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.personpkg.PersonDirect;
import business.rolespkg.Role;
import business.userAccountpkg.UserAcDirect;
import business.workQpkg.WorkQ;
import java.util.ArrayList;


/**
 *
 * @author revat
 */
public abstract class Orga {
    
    private String name;
    private UserAcDirect userAcDirect;
    private PersonDirect personDirect;
    private WorkQ workQ;
    private int orgId;
    private static int counter = 000;

    public Orga(String name) {
    this.name = name;
    userAcDirect = new UserAcDirect();
    personDirect = new PersonDirect();
    workQ = new WorkQ();
    counter++;
    orgId = counter;
    }
    
    public enum Type
    {
     Admin("Admin"),
     Volunteer("Volunteer Organization"),
     HelpSeeker("HelpSeeker Organization"),
     Supervisor("Supervisor Organization"),
     Donor("Donor Organization"),
     Transport("Transport Organization"),
     Mayor("Mayor Organization"),
     Doctor("Doctor Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }

        public String getValue() {
            return value;
        }
    }

    public PersonDirect getPersonDirectory() {
        return personDirect;
    }

    public UserAcDirect getUserAccountDirectory() {
        return userAcDirect;
    }

    public WorkQ getworkQ() {
        return workQ;
    }

    public String getName() {
        return name;
    }
    
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrgId() {
        return orgId;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
}
