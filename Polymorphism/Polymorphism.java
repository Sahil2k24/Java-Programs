//Demostration of Polymorphism
//Polymorphism--> poly=many, morphism=forms (i.e, having multiple forms)

//2 types of polymorphism--> 1)Compile time and 2)runtime polymorphism

/*Compile Time--> Function Overloading
--functions having the same name
--overload means creating functions of the same.
--polymorphism is checked during the compile tinmme itself
*/

import java.util.*;

class Student{
    String name;
    int age;

    public void info(String name)
    {
        System.out.println("Name is : "+name);
    }

    public void info(int age)
    {
        System.out.println("Age is: "+age );
    }

    public void info(String name, int age)
    {
        System.out.println("Name and age is : "+name+" "+age);
    }
}

public class compiletime{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="sahil";
        s1.age=21;

        s1.info(s1.name,s1.age);
    }
}