/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.cmn;

import business.EcoSystem;
import business.enterprisemainpkg.Enterprise;
import business.networkpkg.Network;
import business.orgapkg.DoctorOrga;
import business.orgapkg.DonorOrga;
import business.orgapkg.Orga;
import business.orgapkg.SupervOrga;
import business.orgapkg.TransportOrga;
import business.orgapkg.VolunteerOrga;
import business.userAccountpkg.UserAc;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author revat
 */
public class Validation {
    
    
    
    public static boolean validateString(String name)
    {
        return true;
    }
    
    public static int calculateAge(Date dateOfBirth)
    {
       try
       {     
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
        age--;
        return age;
       }
       catch(Exception e)
       {
        return 0;   
       }
    }
    
    
    public static VolunteerOrga getVolunteerOrganization(EcoSystem ecoSystem, UserAc userAccount)
    {
        VolunteerOrga volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Orga organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof VolunteerOrga)
             {
              volunteerOrganization = (VolunteerOrga)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
    
    public static VolunteerOrga getVolunteerOrganizationInNw(EcoSystem ecoSystem, Network nw)
    {
        VolunteerOrga volunteerOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(nw))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Orga organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof VolunteerOrga)
             {
              volunteerOrganization = (VolunteerOrga)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return volunteerOrganization;
    }
    
      public static DonorOrga getDonorOrganization(EcoSystem ecoSystem, UserAc userAccount)
    {
        DonorOrga donorOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NonProfit))
            {
            for(Orga organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DonorOrga)
             {
              donorOrganization = (DonorOrga)organization; 
             }
            }
            }
          }
         }
        }
        return donorOrganization;
    }
      
       public static TransportOrga getTransportOrganization(EcoSystem ecoSystem, UserAc userAccount)
    {
        TransportOrga transportOrganization = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.School))
            {
            for(Orga organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof TransportOrga)
             {
              transportOrganization = (TransportOrga)organization; 
             }
            }
            }
          }
         }
        }
        return transportOrganization;
    } 
       
     public static DoctorOrga getDoctorOrganization(EcoSystem ecoSystem, UserAc userAccount)
    {
        DoctorOrga doctorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital))
            {
            for(Orga organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof DoctorOrga)
             {
              doctorOrganization = (DoctorOrga)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return doctorOrganization;
    }   
     
      public static SupervOrga getSupervisorOrganization(EcoSystem ecoSystem, UserAc userAccount)
    {
        SupervOrga supervisorOrganization = null;
        try
        {
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.AlohaHelp))
            {
            for(Orga organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof SupervOrga)
             {
              supervisorOrganization = (SupervOrga)organization; 
             }
            }
            }
          }
         }
        }
        }
        catch(NullPointerException npe)
        {
          npe.printStackTrace();
         return null;
        }
        return supervisorOrganization;
    }  
      
 
}
