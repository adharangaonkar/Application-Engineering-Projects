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
public class Passenger {
    private String passengerFName;
    private String passengerLName;
    private String passengerID;
    private String emailID;
    private String seat;
   private ArrayList<Seats> seatList;
    
    public Passenger()
    {
        seatList=new ArrayList<Seats>();
    }

    public Passenger(ArrayList<Seats> seatList) {
        this.seatList = seatList;
    }
  

    public String getPassengerFName() {
        return passengerFName;
    }

    public void setPassengerFName(String passengerFName) {
        this.passengerFName = passengerFName;
    }

    public String getPassengerLName() {
        return passengerLName;
    }

    public void setPassengerLName(String passengerLName) {
        this.passengerLName = passengerLName;
    }
    

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
  /*  public ArrayList<Seats> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seats> seatList) {
        this.seatList = seatList;
    }
    
    public void addSeat(Seats s)
    {
        this.addSeat(s);
    }
    */

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    public void addSeat (Seats s)
    {
        this.seatList.add(s);
    }
    @Override
    public String toString()
    {
        return (this.passengerID);
    }
}

























