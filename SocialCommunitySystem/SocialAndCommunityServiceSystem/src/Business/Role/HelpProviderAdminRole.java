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

import Business.Organization.HelpProviderOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.HelpProvider.HelpProviderAdminWorkArea;


/**
 *
 * @author hp
 */
public class HelpProviderAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new HelpProviderAdminWorkArea(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise/*,system*/);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.HelpProviderAdmin.getValue();
}
    
}







