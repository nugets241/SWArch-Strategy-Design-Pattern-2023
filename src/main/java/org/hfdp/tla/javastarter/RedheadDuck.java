package org.hfdp.tla.javastarter;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("I'm a redhead duck");
    }
}
