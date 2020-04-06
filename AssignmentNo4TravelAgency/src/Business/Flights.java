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
    private String airplaneName;
    private String flightName;
    private String depTime;
    private String depDate;
    private String departure;
    private String arrive;
    private int price;
   // private String status;
    private ArrayList<Seats>seatList;
    private boolean cancelFlag;
    //private boolean cancelled;

   
    

    public Flights() {
        cancelFlag=false;
        seatList= new ArrayList<Seats>();
        seatsInitialization();

    }
     public boolean isCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

   // public String getStatus() {
     //   return status;
    //}

    //public void setStatus(String status) {
    //    this.status = status;
   // }

    //public boolean isCancelled() {
      //  return cancelled;
    //}

    //public void setCancelled(boolean cancelled) {
     //   this.cancelled = cancelled;
    //}

  

  

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }
   /* 
   public Flights(String airlinerName, String flightName, String depTime, String depDate, String departure, String arrive , int price)
    {
        this.airlinerName = airlinerName;
        this.flightName = flightName;
        this.depTime = depTime;
        this.depDate = depDate;
        this.departure = departure;
        this.arrive = arrive;
        this.price = price;
    }*/

    public ArrayList<Seats> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seats> seatList) {
        this.seatList = seatList;
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
        return this.getAirlinerName();
    }

   
        public void seatsInitialization()
    {
        byte j,i;
        char column;
        for (i=0;i<6;i++)
        {
            if (i==0)
                column='A';
            else if (i==1)
                column='B';
            else if (i==2) 
                column='C';
            else if (i==3)
                column='D';
            else if (i==4)
                column='E';
            else
                column='F';
            for (j=1;j<26;j++)
            {
                Seats seats = new Seats();
                seats.setFlights(this);
                seats.setPreference(column+String.valueOf(j));
                seatList.add(seats);
            }
                  
        }
        //To change body of generated methods, choose Tools | Templates.
    }
          public Seats bookingSeat(String seatNum)
    {
       for (Seats s: this.getSeatList())
       {
           if (seatNum.matches(s.getPreference()))
           {
               s.setBooked(true);
               //s.setFlight(this);
               return s;
           }
       }
       return null;
    }
          
    
}
