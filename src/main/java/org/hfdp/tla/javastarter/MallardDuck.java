package org.hfdp.tla.javastarter;

public class MallardDuck extends Duck {
    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("Looks like a mallard duck");
    }
}
