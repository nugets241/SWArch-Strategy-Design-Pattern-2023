package org.hfdp.tla.javastarter;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("Looks like a redhead duck");
    }
}
