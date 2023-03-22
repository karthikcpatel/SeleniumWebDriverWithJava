// Add a call to Pet’s brag method before printing anything in Dog’s brag method (hint: use super to call an overridden method). It should print “I have the best pet!” and then “I have the best dog”.

package assignment;

public class Pet
{

    public void brag()
    {
        System.out.println("I have the best pet!");
    }

    public static void main(String[] args)
    {
        Dog1 d1 = new Dog1();
        d1.brag();
    }
}

class Dog1 extends Pet
{
    public void brag()
    {
        super.brag();
        System.out.println("I have the best dog!");
    }
}
