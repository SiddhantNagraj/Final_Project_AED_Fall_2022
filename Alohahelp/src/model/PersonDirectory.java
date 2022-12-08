/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class PersonDirectory {
      private ArrayList<Volunteer> volunteerList;
      private ArrayList<HelpSeeker> customerList;
      private ArrayList<Person> personList;

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public ArrayList<HelpSeeker> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<HelpSeeker> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
}
