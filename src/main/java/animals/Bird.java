package src.main.java.animals;

import src.main.java.Flyable;

public abstract class Bird extends Animal implements Flyable {

        public void fly() {
            System.out.println(this.getClass().getSimpleName() + " is flying!");
        }
}
