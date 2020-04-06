/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Role;
import Business.Role.DonorRole;
import Business.Supplier.Donor;
import Business.Supplier.DonorDirectory;
import java.util.HashSet;

/**
 *
 * @author hp
 */

    

public class DonorOrganization extends Organization {
    DonorDirectory donorList;

    public DonorOrganization(String name) {
        super(Organization.Type.Donor.getValue());
        donorList = new DonorDirectory();
    }

    public DonorDirectory getDonorList() {
        return donorList;
    }

    public void setDonorList(DonorDirectory donorList) {
        this.donorList = donorList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DonorRole());
       return role;
    }
    
}






