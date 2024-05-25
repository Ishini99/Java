package com.example.demo1;

public class Bike extends Vehicle{
    int loadCapacity;
    public void loadVan() {
        System.out.println("Loading van");
    }
    public void showBike(){
        vehicleName = "bike1";
        color = "red";
        numberOfSeats = 4;
        numberOfWheels = 6;
        System.out.printf("Bike name: "+vehicleName);
        System.out.printf("Bike color: "+color);
        System.out.printf("number Of Seats - Bike"+ numberOfSeats);
        System.out.printf("number Of Wheels - Bike" +numberOfWheels);

    }
}
