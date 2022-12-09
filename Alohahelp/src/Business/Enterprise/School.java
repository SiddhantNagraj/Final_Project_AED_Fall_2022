/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public abstract class School extends Enterprise{
    
     public School(String name) {
        super(name, EnterpriseType.School);
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    } 
}
