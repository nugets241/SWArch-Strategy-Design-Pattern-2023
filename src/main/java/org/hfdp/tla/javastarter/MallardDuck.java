package org.hfdp.tla.javastarter;

public class MallardDuck extends Duck {
    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("I'm a mallard duck");
    }
}
