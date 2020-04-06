/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;


import Business.EcoSystem;


import Business.Organization.SupplierOrganization;

import Interface.SupplierManager.SupplierManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */

public class SupplierManagerRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new SupplierManagerWorkArea(downJPanel,UserAccount,(SupplierOrganization)org,enterprise, ESystem);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SupplierManagerRole.getValue();
}    
}






