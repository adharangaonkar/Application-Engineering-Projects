/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HelpProvider;

import java.util.ArrayList;

/**
 *
 * @author hp
 */

    

public class HelpProviderDirectory 
{
    
    private ArrayList<HelpProvider> helpProviderDirectory;

    public HelpProviderDirectory()
    {
        helpProviderDirectory = new ArrayList<>();
    }

    public ArrayList<HelpProvider> getHelpProviderDirectory() 
    {
        return helpProviderDirectory;
    }

    public void setHelpProviderDirectory(ArrayList<HelpProvider> helpProviderDirectory)
    {
        this.helpProviderDirectory = helpProviderDirectory;
    }
    
    
    public HelpProvider addHelpProvider()
    {
        HelpProvider hp = new HelpProvider();
        helpProviderDirectory.add(hp);
        return hp;
    }
    
    public void removeHelpProvider(HelpProvider hp)
    {
        helpProviderDirectory.remove(hp);
    }
    
}

