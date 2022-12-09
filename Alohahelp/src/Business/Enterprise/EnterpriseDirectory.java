/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author shiba
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<>();
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
      Enterprise enterprise = null;
//      if(type ==Enterprise.EnterpriseType.HeartHelp)
//      {
//       enterprise = new HeartHelpEnterprise(name);
//       enterpriseList.add(enterprise);     
//      }
     if (type == Enterprise.EnterpriseType.Government){
            enterprise = new Government(name);
            enterpriseList.add(enterprise);
        }
       else if (type == Enterprise.EnterpriseType.NonProfit){
            enterprise = new NonProfit(name);
            enterpriseList.add(enterprise);
        }
        else  if(type ==Enterprise.EnterpriseType.School)
        {
         enterprise = new School(name);
         enterpriseList.add(enterprise);     
        }
      else  if(type ==Enterprise.EnterpriseType.Hospital)
        {
         enterprise = new Hospital(name);
         enterpriseList.add(enterprise);     
        }

      return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}
