// Correctly finish the Dog subclass for the following abstract Animal class. Override the abstract methods. It should print “woof” and then “num num”.
package assignment;

abstract class Animal
{
    public String name;
    public int numLegs;
    public abstract void speak();
    public abstract void eat();
}

public class Dog2 extends Animal
{
    public void speak()
    {
        System.out.println("woof");
    }

    public void eat()
    {
        System.out.println("nom nom");
    }

    public static void main(String[] args)
    {
        Dog2 myDog = new Dog2();
        myDog.speak();
        myDog.eat();
    }
}