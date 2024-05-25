package com.example.demo1;

public class Van extends Vehicle {
    public void loadVan(){
        System.out.printf("Loading van");
    }
    public void showVan(){
        vehicleName = "van1";
        color = "green";
        numberOfSeats = 4;
        numberOfWheels = 6;
        System.out.printf("Van name: "+vehicleName);
        System.out.printf("Van color: "+color);
        System.out.printf("number Of Seats - Van"+ numberOfSeats);
        System.out.printf("number Of Wheels -Van" +numberOfWheels);

    }
}
