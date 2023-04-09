
//JUST demonstration of inheritance and the actual implementation in java
//Inheritance--> ability of the child class to acquire all the properties of the parent class
//Inheritance supported by Java:- 1)Single 2)Multi-level 3)Heirarchical 4)Hybrid
//Multiple inheritance is not supported java due to ambiguity that base class gets confused that which method to be called if there exists two methods with the same name.
//Mulitple inheritance is implemented using the concept of interface in java

class shape{
    double a;
    public void area()
    {
        System.out.println("Area is : "+a);
    }
}


class triangle extends shape{
    public void area(){      //single inheritance
       System.out.println( a=0.5*b*h);
    }
}

class equilateral extends triangle{
    public void area(int b, int h){     //multi-level inheritance
        System.out.println(a=1/2*b*h);    //equilateral extends triangle which extends shape
    }
}

class circle extends shape{
    public void area(int r){            //heirarchical inheritance
        System.out.println(a=(3.14)*r*r); //multiple child classes inherits parent class
    }
}

public class inheritance{
    public static void main(String[] args){

    }
}
                                   