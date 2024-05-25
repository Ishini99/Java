package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {


    public static void main(String[] args) {
        Student std = new Student();
        std.setName("amani");
       System.out.println("Name:"+std.getName());
    }
}