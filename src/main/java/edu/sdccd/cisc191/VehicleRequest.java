package edu.sdccd.cisc191;

import java.io.Serializable;


public class VehicleRequest implements Serializable {
    private int year;
    private String make;
    private String model;
    public String message;

    public VehicleRequest(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;

        //message to represent contents of vehicle request
        message = "You requested a " + year + " " + make + " " + model + ".";
    }

    public int getYear(){
        return year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }
}