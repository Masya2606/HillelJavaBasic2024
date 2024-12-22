package com.gmail.mariasyt26.java.homework.homework12;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    private void startElectricity() {
    }

    private void startCommand() {
    }

    private void startFuelSystem() {
    }

    public void start() {
        System.out.println("Car starting...");
        startCommand();
        startElectricity();
        startFuelSystem();
    }
}
