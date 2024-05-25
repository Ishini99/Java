package com.example.demo1;

public class Car extends Vehicle{
    int numberOfDoors;
    public void loadCar(){
        System.out.printf("Loading car");
    }
    public void showCarDetails(){
        vehicleName = "car1";
        color = "red";
        numberOfSeats = 4;
        numberOfDoors =2;
        numberOfWheels = 6;
        System.out.printf("Car name: "+vehicleName);
        System.out.printf("Car color: "+color);
        System.out.printf("number Of Seats"+ numberOfSeats);
        System.out.printf("number Of Doors"+numberOfDoors);
        System.out.printf("number Of Wheels" +numberOfWheels);
    }
}
