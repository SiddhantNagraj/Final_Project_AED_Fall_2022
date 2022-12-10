/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAct;

import Network.Networks;
import Person.Person;
import WorkRequest.WorkRequest;
import business.role.role;


/**
 *
 * @author Siddhant
 */
public class Users {
    
     private String userName;
    private String password;
    private Person person; 

    private Roles role;
    private WorkRequest workRueue;
    private boolean enabled = true;
    private Networks network;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {

        this.role = role;
    }

    public WorkRequest getWorkQueue() {
        return workRueue;
    }

    public void setWorkRequest(WorkRequest workQueue) {
        this.workRueue = workRueue;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Networks getNetwork() {
        return network;
    }

    public void setNetwork(Networks network) {

        this.network = network;
    }
    
    
    
}
