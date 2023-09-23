package org.hfdp.tla.javastarter;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        System.out.println("Can't fly");
    }

    @Override
    public void display() {
        System.out.println("Display Rubber Duck");
    }
}

