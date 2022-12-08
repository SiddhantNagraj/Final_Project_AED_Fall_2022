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
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
      organizationList = new ArrayList<>();
    }
    
    public Organization addOrganization(Type type)
    {
       Organization organization = null;
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new Volunteer();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HelpSeeker.getValue())){
            organization = new HelpSeeker();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new Supervisor();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new Donor();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new Transport();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Mayor.getValue())){
            organization = new Mayor();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
}
