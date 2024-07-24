package src.main.java;

import java.util.List;
import src.main.java.animals.*;
import src.main.java.environment.Environment;
import src.main.java.environment.Sky;
import src.main.java.environment.Water;
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
//********************************************************************
        System.out.println("*******************  Task 15  *********************");

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        List<Environment<?>> environments = List.of(sky, water);

        for (Environment<?> environment: environments) {
            environment.checkTraffic();
        }


    }
}