/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.orgapkg;

import business.orgapkg.Orga.Type;
import java.util.ArrayList;

/**
 *
 * @author revat
 */
public class OrgaDirect {
    
    private ArrayList<Orga> organizationList;
    
    public OrgaDirect()
    {
      organizationList = new ArrayList<>();
    }
    
    public Orga addOrganization(Type type)
    {
       Orga organization = null;
        if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrga();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HelpSeeker.getValue())){
            organization = new HelpSeekerOrga();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supervisor.getValue())){
            organization = new SupervOrga();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrga();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrga();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Mayor.getValue())){
            organization = new MayorOrga();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrga();
            organizationList.add(organization);
        }
        return organization;
    }

    public ArrayList<Orga> getOrganizationList() {
        return organizationList;
    }
    
    public void deleteOrganization(Orga organization)
    {
      organizationList.remove(organization);
    }
    
}
