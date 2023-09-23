package org.hfdp.tla.javastarter;

public class RubberDuck extends Duck {
    RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("Looks like a rubber duck");
    }
}

