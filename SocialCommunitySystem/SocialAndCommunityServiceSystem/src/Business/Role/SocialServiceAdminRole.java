/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.EcoSystem;

import Business.Organization.HelpSeekerOrganization;

import Interface.SocialServiceEnterprise.SocialServiceAdministratorWorkArea;
import Interface.SystemAdministrator.ManageEnterprise;


/**
 *
 * @author hp
 */

public class SocialServiceAdminRole extends Role
{
   @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new SocialServiceAdministratorWorkArea(downJPanel,system, enterprise);
    } 
        @Override
        public String toString()
{
   return Role.RoleType.SocialServiceAdminRole.getValue();
}
}






