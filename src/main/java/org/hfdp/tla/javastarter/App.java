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
        MallardDuck mallardDuck = new MallardDuck();
        System.out.println("This is Mallard Duck -----");
        System.out.println(mallardDuck.swim());
        System.out.println(mallardDuck.display());

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        System.out.println("This is Red Head Duck -----");
        System.out.println(redHeadDuck.swim());
        System.out.println(redHeadDuck.swim());

    }
}