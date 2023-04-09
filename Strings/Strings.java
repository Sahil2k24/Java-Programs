import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

class strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
       
        /*String name1="tony";
        String name2="tony";
        if(name1.compareTo(name2)==0)
        {
            System.out.println("strings are equal.");
        }
        else{
            System.out.println();
        }*/

      /*  String name="12345";
        int num=Integer.parseInt(name);
        System.out.println(num);

        int number=12345;
        String s=Integer.toString(number);
        System.out.println(s.length());
        

        //String Builder

        StringBuilder sb=new StringBuilder("Warananagar");

        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //To set the character at the particular index

        sb.setCharAt(5,'j');
        System.out.println(sb);

        //Insert a character at the particular index

        sb.insert(0,'s');
        System.out.println(sb);

        //delete

        sb.delete(1,4);
        System.out.println(sb);

        sb.append('s');
        sb.append('q');
        System.out.println(sb);
        */

        //To reverse a string

        StringBuilder sb=new StringBuilder("Tatyasaheb Kore Institute of Enginneering and Technology");
        System.out.println("Length of the given string is : "+sb.length());
        sb.reverse();
        System.out.println(sb);

    }
}