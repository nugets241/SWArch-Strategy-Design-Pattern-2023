package org.hfdp.tla.javastarter;

public abstract class Duck {

    public void swim() {
        System.out.println("Swim");
    }

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("Fly");
    }

    public abstract void display();
}
