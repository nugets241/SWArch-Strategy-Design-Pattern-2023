package org.hfdp.tla.javastarter;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("Looks like a redhead duck");
    }
}
