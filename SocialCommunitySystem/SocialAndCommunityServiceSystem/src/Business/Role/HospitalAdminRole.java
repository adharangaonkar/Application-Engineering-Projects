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
import Interface.HospitalEnterPrise.HospitalAdminWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author adhar
 */
public class HospitalAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new HospitalAdminWorkArea(downJPanel,UserAccount,org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.HospitalAdmin.getValue();
}
}



