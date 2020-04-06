/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class NGODirectory 
{
    private ArrayList<NGO> ngodirectory;

    public NGODirectory() 
    {
    ngodirectory= new ArrayList<>();
    }

    public ArrayList<NGO> getNgodirectory()
    {
        return ngodirectory;
    }

    public void setNgodirectory(ArrayList<NGO> ngodirectory) 
    {
        this.ngodirectory = ngodirectory;
    }
    
    public NGO addNGO()
    {
        NGO n =new NGO();
        ngodirectory.add(n);
        return n;
    }
    
    public void removeNGO(NGO n)
    {
        ngodirectory.remove(n);   
    }
}




