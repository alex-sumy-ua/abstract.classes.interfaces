package src.main.java.animals;

import src.main.java.Swimmable;

public class Fish extends Animal implements Swimmable{

    @Override
    void makeSound() {
        System.out.println("Sshhhh...");
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }


}
