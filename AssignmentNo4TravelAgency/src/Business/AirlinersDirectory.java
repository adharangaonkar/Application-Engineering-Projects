/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class AirlinersDirectory {
    private ArrayList <Airliners> airlinersData;
    
    public AirlinersDirectory()
    {
        airlinersData = new ArrayList<Airliners>();
    }

    public ArrayList<Airliners> getAirlinersData() {
        return airlinersData;
    }

    public void setAirlinersData(ArrayList<Airliners> airlinersData) {
        this.airlinersData = airlinersData;
    }
    
    public Airliners add()
    {
        Airliners f1 = new Airliners();
        airlinersData.add(f1);
        return f1;
    }
    
    public void delete (Airliners air)
    {
        airlinersData.remove(air);
    }
    
}    
