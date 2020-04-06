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
    private ArrayList<Flights> flightSearchList;

    public FlightScheDirectory()
    {
        this.flightData = new ArrayList<>();
        
       /* Flights flight1 = new Flights("EMIRATES","AA1","MORNING","12-11-2018", "MUMBAI","BOSTON",800);
        Flights flight2 = new Flights("EMIRATES","AB2","EVENING","01-12-2018", "NAGPUR","BOSTON",850);
        Flights flight3 = new Flights("AIR INDIA","AC3","MORNING","02-11-2018", "BOSTON","DOHA",700);
        Flights flight4 = new Flights("ETIHAD","AD4","EVENING","12-10-2018", "INDORE","NAGPUR",600);
        Flights flight5 = new Flights("QATAR","AE5","MORNING","12-09-2018", "MUMBAI","BOSTON",450);
        Flights flight6 = new Flights("BRITISH AIRWAYS","AF6","NIGHT","12-01-2018", "MUMBAI","NASHIK",850);
        Flights flight7 = new Flights("UNITED AIRWAYS","AG7","MORNING","12-12-2018", "MUMBAI","PUNE",350);
        Flights flight8 = new Flights("TURKISH AIRLINES","AH8","EVENING","12-05-2018", "TEXAS","PUNE",250);
        Flights flight9 = new Flights("AIR INDIA","AI9","NIGHT","12-09-2018", "NEW YORK","SYDNEY",860);
        Flights flight10 = new Flights("EMIRATES","AJ1","EVENING","02-12-2018", "MUMBAI","BOSTON",560);
        
        
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
        */
    }

   
    
    public Flights addFlight()
    {
        Flights f1 = new Flights();
        flightData.add(f1);
        return f1;
    }
    
    public void cancelFlight(Flights f1)
    {
        
      flightData.remove(f1);
    
    }

    public ArrayList<Flights> getFlightData() {
        return flightData;
    }

    public void setFlightData(ArrayList<Flights> flightData) {
        this.flightData = flightData;
    }
    
    
    public ArrayList<Flights> showFlights(String airlineName){
        //ArrayList<Uber> b = a;
        flightSearchList = new ArrayList<Flights>();
        for(Flights flight : flightData){
            if(flight.getAirlinerName().equalsIgnoreCase(airlineName)){
                flightSearchList.add(flight);
            }
        }
    return flightSearchList;
    }
    
   
    
    
    
}
