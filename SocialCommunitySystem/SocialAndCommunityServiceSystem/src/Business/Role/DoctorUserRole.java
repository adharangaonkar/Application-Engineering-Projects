/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import Business.Organization.Organization;
import Business.Organization.DonorOrganization;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import Interface.Donor.DonorAdminWorkArea;
import Interface.Doctor.DoctorUser.DoctorUserWorkArea;
import javax.swing.JPanel;
/**
 *
 * @author adhar
 */
public class DoctorUserRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem){
        return new DoctorUserWorkArea(downJPanel,UserAccount, org,enterprise,ESystem);
    }
        @Override
        public String toString()
{
   return RoleType.DoctorUserRole.getValue();
} 
}


