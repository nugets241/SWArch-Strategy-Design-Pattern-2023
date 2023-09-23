package org.hfdp.tla.javastarter;

public class MallardDuck extends Duck {

    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("Looks like a mallard duck");
    }
}
