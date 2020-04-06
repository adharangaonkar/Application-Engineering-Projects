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
import Interface.HelpSeeker.HelpSeekerUser.HelpSeekerUserWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class HelpSeekerRole extends Role {
    
      @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new HelpSeekerUserWorkArea(downJPanel,account,(HelpSeekerOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.HelpSeeker.getValue();
}
    
}
