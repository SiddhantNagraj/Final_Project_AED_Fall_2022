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
public class HelpSeekerRole  extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HelpSeekerWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
}
