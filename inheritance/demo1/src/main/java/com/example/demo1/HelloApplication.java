package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {


    public static void main(String[] args) {


        Car car1 = new Car();
        Van van1 = new Van();
        Bike bike1 = new Bike();

        car1.loadCar();
        System.out.println(" ");
        car1.showCarDetails();
        System.out.println(" ");
        van1.showVan();
        System.out.println(" ");
        bike1.showBike();
        car1.loadCar();


    }
}