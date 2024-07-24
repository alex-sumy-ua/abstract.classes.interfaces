package src.main.java.environment;

import src.main.java.Flyable;

public class Sky extends Environment<Flyable> {

    @Override
    public void checkTraffic() {

//        for (Flyable flyable: this.traffic) {
//            flyable.fly();
//        }
        this.traffic.forEach(flyable -> flyable.fly());
    }
}
