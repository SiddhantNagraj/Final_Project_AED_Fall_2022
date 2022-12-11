/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.rolespkg;

import business.EcoSystem;
import business.enterprisemainpkg.Enterprise;
import business.orgapkg.Orga;
import business.userAccountpkg.UserAc;
import javax.swing.JPanel;
import userInterface.SystemAdmin.SystemAdminWorkAreaJPanel;



/**
 *
 * @author Siddhant
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAc account, Orga organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
