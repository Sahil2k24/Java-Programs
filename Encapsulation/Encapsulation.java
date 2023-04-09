import javax.imageio.plugins.tiff.GeoTIFFTagSet;

//Encapsulation
/* 
class area
{
    int length;
    int breadth;

    area(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public void get_area()
    {
        int a=length*breadth;
        System.out.println("Area is : "+a);
    } 
}

public class encap{
    public static void main(String[] args)
    {
        area a1=new area(12,13);
        a1.get_area();
    }
}*/

class name{

    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }
}

public class encap{
    public static void main(String[] args)
    {
        name n1=new name();
        n1.setAge(12);
        System.out.println("The age of the person is : "+n1.getAge());
    }
}