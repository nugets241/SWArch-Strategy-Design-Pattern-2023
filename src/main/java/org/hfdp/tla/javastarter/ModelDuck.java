package org.hfdp.tla.javastarter;

public class ModelDuck extends Duck{
    ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
