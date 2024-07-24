package src.main.java.environment;

import src.main.java.Swimmable;

public class Water extends Environment<Swimmable> {

    @Override
    public void checkTraffic() {
//        this.traffic.forEach(flyable -> flyable.fly());
        this.traffic.forEach(swimmable -> swimmable.swim());
    }
}
