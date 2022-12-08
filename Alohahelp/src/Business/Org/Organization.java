/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Org;

import java.util.ArrayList;
import model.PersonDirectory;
import model.UserDirectory;
import model.WorkRequest;

/**
 *
 * @author shiba
 */
public abstract class Organization {
    private String name;
    private UserDirectory userDirectory;
    private PersonDirectory personDirectory;
    private WorkRequest WorkRequest;
    private int orgId;
    private static int counter = 000;

    public Organization(String name) {
    this.name = name;
    userDirectory = new UserDirectory();
    personDirectory = new PersonDirectory();
    WorkRequest = new WorkRequest();
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

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public WorkRequest getWorkRequest() {
        return WorkRequest;
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
