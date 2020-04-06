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
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Donor.DonorAdminWorkArea;
import Interface.Volunteer.VolunteerAdminWorkArea;
/**
 *
 * @author adhar
 */
public class DonorAdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DonorAdminWorkArea(downJPanel,UserAccount,(DonorOrganization)org,enterprise,ESystem);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.DonorAdminRole.getValue();
}
    
}




