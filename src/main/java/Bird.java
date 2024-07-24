package src.main.java;

public abstract class Bird extends Animal implements Flyable {

        void fly() {
            System.out.println(this.getClass().getSimpleName() + " is flying!");
        }
}
