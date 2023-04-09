/*Demonstration of Abstraction

ABSTRACTION--> Hiding the implementation details and showing only useful parts to the user

DATA HIDING--> Process of protecting the members of the class from unintended changes
*/

abstract class animal{

    animal()
    {
        System.out.println("You are creating a new animal.");  //can have constructors
    }

    abstract void walk();
    public void eat()           //can also declare abstract and non-abstract methods in abstract class
   {
    System.out.println("Animals also eats.");
   }
}

class horse extends animal{

    horse()
    {
        System.out.println("You have created horse");
    }
    public void walk()
    {
        System.out.println("Walks on four legs");
    }
}

class chicken extends animal{

    chicken()
    {
        System.out.println("You have created chicken");
    }
    public void walk()
    {
        System.out.println("Walks on two legs.");
    }
}


public class abstraction{
    public static void main(String[] args){

        horse h=new horse();
        h.walk();


        chicken c=new chicken();
        c.walk();
        c.eat();
    }
}