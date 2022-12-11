/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccountpkg;

import business.networkpkg.Network;
import business.personpkg.Person;
import business.rolespkg.Role;
import business.workQpkg.WorkQ;


/**
 *
 * @author shiba
 */
public class UserAc {
    
    private String uname;
    private String pass;
    private Person person; 
    private Role role;
    private WorkQ workQ;
    private boolean enabled = true;
    private Network network;
   
    
    public UserAc() {
        workQ = new WorkQ();
    }
  
    public String getUserName() {
        return uname;
    }

    public void setUserName(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQ getWorkQueue() {
        return workQ;
    }

    public void setWorkQueue(WorkQ workQ) {
        this.workQ = workQ;
    }

    @Override
    public String toString() {
        return uname; //To change body of generated methods, choose Tools | Templates.
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Network getNetwork() {
        return network;
    }

    
    
    
}
