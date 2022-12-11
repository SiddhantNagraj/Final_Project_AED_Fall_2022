/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisemainpkg;

import business.orgapkg.Orga;
import business.orgapkg.OrgaDirect;

/**
 *
 * @author Siddhant
 */
public abstract class Enterprise extends Orga{
    
    
    private String enterpId;
    private static int count = 1;
    private OrgaDirect orgDirect;
    private EnterpriseType enterptyp;
    
    public Enterprise(String enterpriseName, EnterpriseType enterptyp)
    {
        super(enterpriseName);
        this.enterptyp = enterptyp;
        orgDirect = new OrgaDirect();
        StringBuffer sb = new StringBuffer();
        sb.append("ENT");
        sb.append(count);
        enterpId = sb.toString();
        count++;
    }
    
    public enum EnterpriseType{
        
       School("School"),
       AlohaHelp("AlohaHelp"),
       NonProfit("NonProfit"),
       Government("Government"),
       Hospital("Hospital");
    
       
       private String value;
       
       private EnterpriseType(String value)
       {
         this.value = value;  
       }

        public String getValue() {
            return value;
        }
    }

    public OrgaDirect getOrganizationDirectory() {
        return orgDirect;
    }

    public EnterpriseType getEnterpriseType() {
        return enterptyp;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
}
