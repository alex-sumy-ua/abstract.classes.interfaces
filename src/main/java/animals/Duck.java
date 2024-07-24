package src.main.java.animals;

import src.main.java.Swimmable;

public class Duck extends Bird implements Swimmable {

    @Override
    void makeSound() {
        System.out.println("Chick-Chirick");
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
