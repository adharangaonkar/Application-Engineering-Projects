/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Doctor.DoctorDirectory;
import Business.Role.DoctorAdminRole;
import Business.Role.DoctorUserRole;
import Business.Role.NGOManagerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author adhar
 */
public class DoctorOrganization extends Organization{
     DoctorDirectory doclist;
    
    public DoctorOrganization(String name)
    {
        super(Organization.Type.Doctor.getValue());
        doclist=new DoctorDirectory();
    }

    

   

    public DoctorDirectory getDoclist() {
        return doclist;
    }

    public void setDoclist(DoctorDirectory doclist) {
        this.doclist = doclist;
    }

 
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new DoctorAdminRole());
       return role;
       
    }   
}




