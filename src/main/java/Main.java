package src.main.java;

import java.util.List;
import src.main.java.animals.*;
import src.main.java.vehicles.*;

public class Main {

    public static void main(String[] args) {

        List<Object> objects = List.of(
                new Aeroplane(),
                new Car(),
                new Pigeon(),
                new Duck(),
                new Fish()
        );

        for (Object object : objects) {

            if (object instanceof Swimmable swimmable) {
                swimmable.swim();
            }

            if (object instanceof Flyable flyable) {
                flyable.fly();
            }

            if (object instanceof Vehicle vehicle) {
                vehicle.move();
            }

        }

    }
}