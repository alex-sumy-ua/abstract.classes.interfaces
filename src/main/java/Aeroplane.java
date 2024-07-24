package src.main.java;

public class Aeroplane extends Vehicle implements Flyable {
    @Override
    void move() {
        fly();
    }

    void fly() {
        System.out.println("Aeroplane is flying.");
    }
}
