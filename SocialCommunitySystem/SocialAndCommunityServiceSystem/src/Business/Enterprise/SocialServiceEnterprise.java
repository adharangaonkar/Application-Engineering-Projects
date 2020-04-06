/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Role.HelpProviderAdminRole;
import Business.Role.HelpSeekerAdminRole;
import Business.Role.SocialServiceAdminRole;

import Business.Role.Role;
import Business.Role.VolunteerAdminRole;

import java.util.HashSet;

/**
 *
 * @author hp
 */

public class SocialServiceEnterprise extends Enterprise
{
    public SocialServiceEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.SocialService);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new CommunityAdminRole());
       
        role.add(new HelpProviderAdminRole());
              
        role.add(new HelpSeekerAdminRole());
        
        role.add(new VolunteerAdminRole());
       
        return role;
        
    }
}












