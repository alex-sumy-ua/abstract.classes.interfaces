package src.main.java.vehicles;

import src.main.java.Flyable;

public class Aeroplane extends Vehicle implements Flyable {
    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }

    @Override
    void move() {
        fly();
    }
}
