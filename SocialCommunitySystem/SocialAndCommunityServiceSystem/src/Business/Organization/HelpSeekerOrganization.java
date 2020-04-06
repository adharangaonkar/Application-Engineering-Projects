/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.HelpSeeker.HelpSeekerDirectory;
import Business.Role.HelpSeekerRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hp
 */

public class HelpSeekerOrganization extends Organization{
   HelpSeekerDirectory helpseekerlist;
    public HelpSeekerOrganization()
    {
        super(Organization.Type.HelpSeeker.getValue());
        helpseekerlist=new HelpSeekerDirectory();
    }

    public HelpSeekerDirectory getHelpseekerlist() {
        return helpseekerlist;
    }

    public void setHelpseekerlist(HelpSeekerDirectory helpseekerlist) {
        this.helpseekerlist = helpseekerlist;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new HelpSeekerRole());
        return role;
        
    }
    
}





