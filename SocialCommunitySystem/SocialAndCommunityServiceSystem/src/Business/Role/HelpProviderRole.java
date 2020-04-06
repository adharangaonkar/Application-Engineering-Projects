/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HelpProviderOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.HelpProvider.HelpProviderUser.HelpProviderUserWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class HelpProviderRole extends Role {
    
       @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new HelpProviderUserWorkArea(downJPanel,account,(HelpProviderOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.HelpProvider.getValue();
}
    
}
