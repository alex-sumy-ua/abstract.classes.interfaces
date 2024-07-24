package src.main.java.environment;

import src.main.java.Driveable;

public class Road extends Environment<Driveable> {

    @Override
    public void checkTraffic() {
//         this.traffic.forEach(flyable -> flyable.fly());
        this.traffic.forEach(driveable -> driveable.drive());
    }
}
