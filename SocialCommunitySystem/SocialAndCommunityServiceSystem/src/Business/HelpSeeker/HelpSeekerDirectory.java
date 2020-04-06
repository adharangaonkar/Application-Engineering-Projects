/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpSeeker;


import java.util.ArrayList;

/**
 *
 * @author hp
 */


public class HelpSeekerDirectory
{
    private ArrayList<HelpSeeker> helpSeekerDirectory;

    public HelpSeekerDirectory()
    {
        helpSeekerDirectory = new ArrayList<>();
        
    }

    public ArrayList<HelpSeeker> getHelpSeekerDirectory() 
    {
        return helpSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<HelpSeeker> helpSeekerDirectory) 
    {
        this.helpSeekerDirectory = helpSeekerDirectory;
    }
    
    public HelpSeeker addHelpSeeker()
    {
        HelpSeeker hs = new HelpSeeker();
        helpSeekerDirectory.add(hs);
        return hs;
    }
    
    public void removeHelpSeeker(HelpSeeker hs)
    {
        helpSeekerDirectory.remove(hs);
    }
    
}

