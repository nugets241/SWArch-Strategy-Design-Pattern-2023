package org.hfdp.tla.javastarter;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "=== Welcome to the SW Architechture and Design Cource ===" );
        MallardDuck mallard = new MallardDuck();
        mallard.swim();
        mallard.quack();
        mallard.fly();
        mallard.display();

        RedheadDuck redhead = new RedheadDuck();
        redhead.swim();
        redhead.quack();
        redhead.fly();
        redhead.display();

    }
}