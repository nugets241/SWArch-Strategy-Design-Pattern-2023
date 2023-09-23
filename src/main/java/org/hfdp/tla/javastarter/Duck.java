package org.hfdp.tla.javastarter;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();

    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silent >>");
    }
}

interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I 'm flying with a rocket!");
    }
}