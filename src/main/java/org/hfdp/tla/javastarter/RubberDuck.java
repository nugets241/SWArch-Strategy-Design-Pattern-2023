package org.hfdp.tla.javastarter;

public class RubberDuck extends Duck {
    RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("I'm a rubber duck");
    }
}

