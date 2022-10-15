package edu.sdccd.cisc191;

import java.io.Serializable;
import java.util.Arrays;

public class VehicleResponse implements Serializable {
    private VehicleRequest request;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private int numberOfDoors;
    private String[] options;
    public String message;
    public VehicleResponse(VehicleRequest request, int milesOnVehicle, int price, int numberOfSeats, int numberOfDoors, String[] options){
        this.request = request;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;

        this.options = options;
        //message to represent contents of vehicle response
        message = request.message +
                " This vehicle has " + milesOnVehicle +
                " miles, cost $" + price +
                ", " + numberOfSeats +
                " seats, " + numberOfDoors +
                " doors, and includes these options: " + Arrays.toString(options) + ".";
    }

    public VehicleRequest getRequest(){
        return request;
    }

    public int getMilesOnVehicle(){
        return milesOnVehicle;
    }

    public int getPrice(){
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String[] getOptions() {
        return options;
    }

    public void setRequest(VehicleRequest request) {
        this.request = request;
    }

    public void setMilesOnVehicle(int milesOnVehicle) {
        this.milesOnVehicle = milesOnVehicle;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}