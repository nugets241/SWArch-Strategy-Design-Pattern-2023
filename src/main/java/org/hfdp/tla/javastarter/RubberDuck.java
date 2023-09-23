package org.hfdp.tla.javastarter;

public class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new FlyNoWay();  // Rubber ducks can't fly
    }

    @Override
    void quack() {
        System.out.println("Squeak");  // Rubber ducks squeak instead of quack
    }

    void display() {
        System.out.println("Looks like a rubber duck");
    }
}

