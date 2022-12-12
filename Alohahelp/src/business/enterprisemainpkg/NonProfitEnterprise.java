/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprisemainpkg;

import business.enterprisemainpkg.Enterprise.EnterpriseType;
import business.rolespkg.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class NonProfitEnterprise extends Enterprise
{

    
     public NonProfitEnterprise(String name) {
        super(name, EnterpriseType.NonProfit);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
