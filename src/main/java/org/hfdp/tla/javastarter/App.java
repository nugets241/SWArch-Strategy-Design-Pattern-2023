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
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        RedheadDuck redhead = new RedheadDuck();
        redhead.swim();
        redhead.performQuack();
        redhead.performFly();
        redhead.display();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.display();
    }
}