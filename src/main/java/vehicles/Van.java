package src.main.java.vehicles;

import src.main.java.Driveable;

public class Van extends Vehicle implements Driveable {

    @Override
    public void move() {
        System.out.println("Van is driving.");
    }

    @Override
    public void drive() {
        System.out.println("Van is being driven!");
    }
}
