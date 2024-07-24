package src.main.java.vehicles;

import src.main.java.Driveable;

public class Lorry extends Vehicle implements Driveable {
    @Override
    public void move() {
        System.out.println("Lorry is driving.");
    }

    @Override
    public void drive() {
        System.out.println("Lorry is being driven!");
    }

}
