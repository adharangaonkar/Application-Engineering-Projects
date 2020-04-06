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

import Business.Role.Role.RoleType;

import Interface.SupplierEnterprise.SupplierAdministratorWorkArea;


/**
 *
 * @author hp
 */

public class SupplierAdminRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierAdministratorWorkArea(downJPanel,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.SupplierAdminRole.getValue();
}
}



