//print reverse string using recursion

//Time Complexity--> O(n)
import java.util.*;

public class ReverseString{

    public static void rev(String str,int index){

        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        rev(str,index-1);

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String you want to reverse : ");
        String str=sc.next();
        System.out.println("Reversed string is : ");
        rev(str,str.length()-1);
    }
}