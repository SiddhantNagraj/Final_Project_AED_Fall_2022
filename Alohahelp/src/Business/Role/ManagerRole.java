/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Org.Organization;
import javax.swing.JPanel;

/**
 *
 * @author revat
 */
public class ManagerRole  extends Role{
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManagerWorkArea(userProcessContainer, enterprise,business, account);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    } 

    
}
