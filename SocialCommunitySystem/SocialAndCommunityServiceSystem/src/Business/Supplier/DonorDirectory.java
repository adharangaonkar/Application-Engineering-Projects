/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class DonorDirectory 
{
    private ArrayList<Business.Supplier.Donor> donorList;

    public DonorDirectory()
    {
        donorList = new ArrayList<>();
        
    }

    public ArrayList<Business.Supplier.Donor> getDonorList() 
    {
        return donorList;
    }

    public void setDonorList(ArrayList<Business.Supplier.Donor> donorList) 
    {
        this.donorList = donorList;
    }
    
    public Business.Supplier.Donor addDonor()
    {
    
        Business.Supplier.Donor don = new Business.Supplier.Donor();
        donorList.add(don);
        return don;
    }
    
    public void removeDonor(Business.Supplier.Donor don){
        donorList.remove(don);
    }
}






