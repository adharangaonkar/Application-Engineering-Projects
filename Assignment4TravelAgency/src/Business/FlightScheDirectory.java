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
public class FlightScheDirectory {
    
    private ArrayList <Flights> flightData;

    public FlightScheDirectory()
    {
        this.flightData = new ArrayList<>();
        
        Flights flight1 = new Flights("EMIRATES","AA1", "MUMBAI","BOSTON",800);
        Flights flight2 = new Flights("EMIRATES","AB2", "NAGPUR","BOSTON",850);
        Flights flight3 = new Flights("AIR INDIA","AC3", "BOSTON","DOHA",1);
        Flights flight4 = new Flights("ETIHAD","AD4", "INDORE","NAGPUR",1);
        Flights flight5 = new Flights("QATAR","AE5", "MUMBAI","BOSTON",1);
        Flights flight6 = new Flights("BRITISH AIRWAYS","AF6", "MUMBAI","NASHIK",1);
        Flights flight7 = new Flights("UNITED AIRWAYS","AG7", "MUMBAI","PUNE",1);
        Flights flight8 = new Flights("TURKISH AIRLINES","AH8", "TEXAS","PUNE",1);
        Flights flight9 = new Flights("AIR INDIA","AI9", "NEW YORK","SYDNEY",1);
        Flights flight10 = new Flights("EMIRATES","AJ1", "MUMBAI","BOSTON",1);
        
        
        flightData.add(flight1);
        flightData.add(flight2);
        flightData.add(flight3);
        flightData.add(flight4);
        flightData.add(flight5);
        flightData.add(flight6);
        flightData.add(flight7);
        flightData.add(flight8);
        flightData.add(flight9);
        flightData.add(flight10);
        
    }

    public ArrayList<Flights> getFlightData() {
        return flightData;
    }

    public void setFlightData(ArrayList<Flights> flightData) {
        this.flightData = flightData;
    }
    
   
    
    
    
}
