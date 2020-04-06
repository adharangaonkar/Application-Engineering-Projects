/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author hp
 */
public class Airliners {
    private String airlinersName;
    private int strengthofFlights;
    private String freqOfFlights;
    private String headOffice;
    private String regionOfOperations;
    
                                                                                                                                                                        

 

   

    public String getAirlinersName() {
        return airlinersName;
    }

    public void setAirlinersName(String airlinersName) {
        this.airlinersName = airlinersName;
    }

   
    public int getStrengthofFlights() {
        return strengthofFlights;
    }

    public void setStrengthofFlights(int strengthofFlights) {
        this.strengthofFlights = strengthofFlights;
    }
   
    public String getFreqOfFlights() {
        return freqOfFlights;
    }

    public void setFreqOfFlights(String freqOfFlights) {
        this.freqOfFlights = freqOfFlights;
    }

    public String getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }
    
     public String getRegionOfOperations() {
        return regionOfOperations;
    }

    public void setRegionOfOperations(String regionOfOperations) {
        this.regionOfOperations = regionOfOperations;
    }
    
    
    
    @Override
    public String toString()
    {
        return airlinersName;
    }
}


