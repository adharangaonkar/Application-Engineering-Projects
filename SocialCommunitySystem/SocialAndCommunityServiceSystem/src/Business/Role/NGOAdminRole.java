/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.NGOEnterprise.NGOAdminWorkArea;
import javax.swing.JPanel;


/**
 *
 * @author hp
 */
public class NGOAdminRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new NGOAdminWorkArea(downJPanel,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return RoleType.NGOAdminRole.getValue();
}
    
   
}
