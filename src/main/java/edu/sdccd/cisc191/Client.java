package edu.sdccd.cisc191;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket s = new Socket("localhost", 4999); //client socket with specified hostname and port for connection

        ObjectOutputStream outStream = new ObjectOutputStream(s.getOutputStream()); //new outStream to send out request

        VehicleRequest vehicleRequest = new VehicleRequest(2023, "Toyota", "Supra" ); //generates vehicle request object
        outStream.writeObject(vehicleRequest); //send request via outStream
        outStream.flush(); //flush for good practice

        ObjectInputStream inStream = new ObjectInputStream(s.getInputStream()); //inStream to receive response

        //reads object from inStream and cast as new VehicleResponse object to be stored in variable
        VehicleResponse receiveResponse = (VehicleResponse)inStream.readObject();
        System.out.println("Vehicle response received."); //response received confirmation message
        System.out.println(receiveResponse.message); //prints out message string stored in new object containing vehicle response info

        outStream.close();
        s.close(); //close connection and good practice
    }
}
