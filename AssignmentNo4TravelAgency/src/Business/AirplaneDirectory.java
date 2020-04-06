/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author adhar
 */
public class AirplaneDirectory {
        
    
        private Airliners airliners;
        private ArrayList <Airplane> airplaneData;
        
               public AirplaneDirectory()
    {
        airplaneData = new ArrayList<Airplane>();
    }

    public Airliners getAirliners() {
        return airliners;
    }

    public void setAirliners(Airliners airliners) {
        this.airliners = airliners;
    }
        
        
  

    public ArrayList<Airplane> getAirplaneData() {
        return airplaneData;
    }

    public void setAirplaneData(ArrayList<Airplane> airplaneData) {
        this.airplaneData = airplaneData;
    }
    
 
    
    public Airplane addPlane()
    {
        Airplane p1 = new Airplane();
        airplaneData.add(p1);
        return p1;
    }
    
    public void delete (Airplane air)
    {
        airplaneData.remove(air);
    }
    
    
}




