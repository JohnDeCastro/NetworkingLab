package edu.sdccd.cisc191;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(4999); //server listener on this port
        Socket s = ss.accept(); //accepts socket

        System.out.println("Client connected"); //connection confirmation message

        ObjectInputStream inStream = new ObjectInputStream(s.getInputStream()); //inStream to receive request

        //reads object from inStream and cast as new VehicleRequest object to be stored in variable
        VehicleRequest receiveRequest = (VehicleRequest)inStream.readObject();
        System.out.println("Vehicle request received."); //request received confirmation message
        System.out.println(receiveRequest.message); //prints out message string stored in new object containing vehicle request info

        ObjectOutputStream outStream = new ObjectOutputStream(s.getOutputStream()); //new output stream to send out data

        //generate new response object containing message about vehicle from request
        VehicleResponse vehicleResponse = new VehicleResponse(receiveRequest, 1000, 58990, 2, 2, new String[]{"Manual Trans" , "Leather Seats"});
        outStream.writeObject(vehicleResponse); //send response via outStream
        outStream.flush(); //flush for good practice

        ss.close(); //close to prevent memory leak and good practice
    }
}
