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
public class Airplane {
    private String airplaneName;
    private String airplaneID;
    private int modelNumber;
    private int manuYear;
    private ArrayList<Flights> planeFlightList;
    private AirplaneDirectory airplaneDirectory;
    public Airplane ()
    {
        airplaneName = "";
        airplaneID = "";
       // String.valueOf(modelNumber)= "";
       // manuYear = "";
        planeFlightList = new ArrayList<Flights>();
    }

    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getManuYear() {
        return manuYear;
    }

    // private String regionOfOperations;
    public void setManuYear(int manuYear) {
        this.manuYear = manuYear;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(String airplaneID) {
        this.airplaneID = airplaneID;
    }


/*
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManuYear() {
        return manuYear;
    }

    public void setManuYear(String manuYear) {
        this.manuYear = manuYear;
    }*/

    public ArrayList<Flights> getPlaneFlightList() {
        return planeFlightList;
    }

    public void setPlaneFlightList(ArrayList<Flights> planeFlightList) {
        this.planeFlightList = planeFlightList;
    }
    
     @Override
    public String toString()
    {
        return airplaneName;
    }
}







