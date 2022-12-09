/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Siddhant
 */
public class NonProfit extends Enterprise
{

    
     public NonProfit(String name) {
        super(name, EnterpriseType.NonProfit);
    }

  
    public ArrayList<Role> getSupportedRole() {
        return null;
    }}