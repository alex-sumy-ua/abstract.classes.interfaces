package src.main.java.vehicles;

import src.main.java.Driveable;

public class Car extends Vehicle implements Driveable {
    @Override
    public void move() {
        System.out.println("Car is driving.");
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven!");
    }
}
