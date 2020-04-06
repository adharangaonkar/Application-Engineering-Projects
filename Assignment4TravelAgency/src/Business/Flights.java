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
public class Flights {
    private String airlinerName;
    private String flightName;
    
    private String departure;
    private String arrive;
    
    private int price;
    
    public Flights(String airlinerName, String flightName, String departure, String arrive , int price)
    {
        this.airlinerName = airlinerName;
        this.flightName = flightName;
        this.departure = departure;
        this.arrive = arrive;
        this.price = price;
    }
    
    Flights()
    {
        
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    //  private ArrayList<Seat> seatsList;
    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
    
    @Override
    public String toString()
    {
        return airlinerName;
    }
    
}
