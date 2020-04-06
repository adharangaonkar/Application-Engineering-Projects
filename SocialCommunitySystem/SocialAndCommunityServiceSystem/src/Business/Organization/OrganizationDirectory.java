/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author hp
 */


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type,String name)
    {
    Organization organization = null;
        if (type.getValue().equals(Organization.Type.HelpProvider.getValue())){
            
            organization = new HelpProviderOrganization();
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HelpSeeker.getValue())){
            organization = new HelpSeekerOrganization();
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.NGO.getValue())){
            organization = new NGOOrganization();
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Supplier.getValue())){
            organization = new SupplierOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Donor.getValue())){
            organization = new DonorOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new VolunteerOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization(name);
            organization.setOrganizationName(name);
            organizationList.add(organization);
        }
        
        
        return organization;
    }

    
}








