package org.hfdp.tla.javastarter;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Display Mallard Duck");
    }
}
