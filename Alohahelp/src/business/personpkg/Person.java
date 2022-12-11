/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.personpkg;

import business.cmn.Donation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Siddhant
 */
public class Person {
    
    private String fName;
    private String name;
    private String lName;
    private Date dobirth;
    private String add1;
    private String pNo;
    private String pId;
    private boolean Volunteer;
    private boolean HelpSeeker;
    private String emailId;
    private String occupation;
    private String add2;
    private String town;
    private String zipCode;
    private String gender;
    private static int count = 00001;
    private String country;
    private String state;
    private int age;
    private ArrayList<Donation> donationList;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person()
    {
     StringBuffer sb = new StringBuffer();
        sb.append("PER");
        sb.append(count);
        pId = sb.toString();
        count++;   
        donationList = new ArrayList<>();
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dobirth;
    }

    public void setDob(Date dobirth) {
        this.dobirth = dobirth;
    }

    public void setPhoneNumber(String pNo) {
        this.pNo = pNo;
    }

    public String getPhoneNumber() {
        return pNo;
    }

    
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = this.fName+ " "+this.lName;
    }

    public String getPersonId() {
        return pId;
    }

   
    public boolean isVolunteer() {
        return Volunteer;
    }

    public void setVolunteer(boolean Volunteer) {
        this.Volunteer = Volunteer;
    }

    public boolean isHelpSeeker() {
        return HelpSeeker;
    }

    public void setHelpSeeker(boolean HelpSeeker) {
        this.HelpSeeker = HelpSeeker;
    }

   
    public String getAddress1() {
        return add1;
    }

    public void setAddress1(String add1) {
        this.add1 = add1;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

 

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress2() {
        return add2;
    }

    public void setAddress2(String add2) {
        this.add2 = add2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

   
    
    @Override
    public String toString() {
        return this.name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

       public Donation addDonation()
    {
        Donation donation = new Donation();
        donationList.add(donation);
        return donation;
    }
            
}
