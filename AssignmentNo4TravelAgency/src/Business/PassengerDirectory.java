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
public class PassengerDirectory {
    private ArrayList<Passenger> passengerList;
    
    public PassengerDirectory()
    {
        
        this.passengerList = new ArrayList<Passenger>();
        passengerList = new ArrayList<>();
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
    public Passenger addP()
    {
        Passenger p = new Passenger();
        passengerList.add(p);
        return p;
        
        
    }
}












