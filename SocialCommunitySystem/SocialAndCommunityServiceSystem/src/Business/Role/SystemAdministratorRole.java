/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Interface.SystemAdministrator.SystemAdministratorWorkArea;


/**
 *
 * @author hp
 */


public class SystemAdministratorRole extends Role 
{
 
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system)
    {
        return new SystemAdministratorWorkArea  (downJPanel , system);
    }
        @Override
        public String toString()
{
   return RoleType.SystemAdministrator.getValue();
}
}





