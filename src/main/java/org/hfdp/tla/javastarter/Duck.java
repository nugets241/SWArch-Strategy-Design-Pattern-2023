package org.hfdp.tla.javastarter;

public abstract class Duck {

    FlyBehavior flyBehavior;

    void quack() {
        System.out.println("Quack");
    }

    void performFly() {
        flyBehavior.fly();  // Delegating fly behavior
    }

    void swim() {
        System.out.println("Swim");
    }

    abstract void display();

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
}

interface QuackBehavior {
    void quack();
}

interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Fly with wings");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        // Do nothing - can't fly!
    }
}