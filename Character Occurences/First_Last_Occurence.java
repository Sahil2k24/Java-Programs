//Print the first and last occurence of the particular element in the string
//Time Complexity-->O(n)

import java.util.*;

public class occur{

    public static int first=-1;
    public static int last=-1;

    public static void firstoccur(String str, int index, char element){

        if(index==str.length()){
            System.out.println("First Occurence of the character is :");
            System.out.println(first);
            System.out.println("Last Occurence of the character is :");
            System.out.println(last);
            return;
        }

        char currchar=str.charAt(index);

        if(currchar==element){
        if(first==-1)
        {
            first=index;
        }
        else
        {
            last=index;
        }
    }
     firstoccur(str,index+1,element);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.next();

        firstoccur(str,0,'a');

    }
}
