/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HelpSeekerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.HelpSeeker.HelpSeekerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class HelpSeekerAdminRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new HelpSeekerAdminWorkArea(downJPanel,enterprise);
    }
        @Override
        public String toString()
{
   return Role.RoleType.HelpSeekerAdmin.getValue();
}
    
}
