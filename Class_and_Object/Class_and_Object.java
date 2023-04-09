
//Demonstration of class and object
//this keyword is used to tell the method which object it has called.
//new keyword is used for allocating the memory in the heap

class pen{
    String color;
    String type;

    public  void write()
    {
        System.out.println("The pen is writing something.");
    }

    public void print()
    {
        System.out.println(this.color); 
        System.out.println(this.type);
    }
}

class Student     //By convention class name should be starting with capital letter.
{
    String name;
    int age;

    public void info(){
    System.out.println("Name is : "+this .name);
    System.out.println("Age is : "+this.age);
    }

    //Constructor is used to initialise the object of the class
    /***non-parameterized constructor
    Student()
    {
        System.out.println("Constructor called."); 
    } */                                             //by default given by the compiler                 

    /***Parameterized constructor
    Student(String name,int age)   
    {
        this.name=name; //here this.name is object name and the second name is argumnet passed in the constructor
        this .age=age;
    }*/

    /*Copy Constructor-->making copy one object and put into another object
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }

    Student() //this constructor needs to be defined as it is provided by default
    {         //Copy constructor is user defined in java  

    }
    */

    //Destrucor is used to destroy the object of the class
    //In java, there is **automatic garbage collector** that deletes the object which is not in use
    //no need for the user to call the destructor 
}
public class class_and_object{
    public static void main(String[] args){

        pen p1=new pen();
        p1.color="blue";
        p1.type="gel";

       // p1.write();

        pen p2=new pen();
        p2.color="black";
        p2.type="ballpoint";

        //p1.print();
        //p2.print();

        //Student s1=new Student("sahil",22);
        //s1.name="sahil";
        //s1.age=21;
        //s1.info();

        Student s1=new Student();
        s1.name="sahil";
        s1.age=22;

        Student s2=new Student(s1);
        s2.info();

        //Student s2=new Student();
        //s2.name="abhijit";
        //s2.age=22;
        //s2.info();
    }
}
