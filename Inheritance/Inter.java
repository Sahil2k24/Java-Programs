//Demonstration of interface in java
//uses implements keyword
/*
interface animal{

    public void walk();  //only consists of body and not implentation
}

class horse implements animal{
    public void walk()  //actaual implementation of the walk method.
    {
        System.out.println("Walks on four legs.");
    }
}

public class inter{
    public static void main(String[] args){

        horse h=new horse();
        h.walk();
    }
}*/

//static--> keyword is used where the properties are common for the class
//can access a static variable by using the "classname & . "
//for static members memory is alloted only once unlike objects
//hence memory consumption is less for static properties

class student{
    String name;
    static String school;   //static variable

    public static void change()   //static method
    {
        school="newschool";
    }
}

public class inter{
    public static void main(String[] args){
        student.school="tkea";

        student s=new student();
        s.name="sahil";
        System.out.println(s.name);
        System.out.println(student.school);
    }
}