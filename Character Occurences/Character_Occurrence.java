//Count the charater occurence in a string

import java.util.*;
import java.io.*;

public class charoccurrence{

    public static void count_char(String inputstr)
    {
        HashMap<Character,Integer> charcount=new HashMap<Character,Integer>();

        char[] strarr=inputstr.toCharArray();

        for(char c:strarr)
        {
            if(charcount.containsKey(c))
            {
                charcount.put(c , charcount.get(c) + 1);
            }
            else
            {
                charcount.put(c,1);
            }
        }
            for(Map.Entry entry:charcount.entrySet())
            {
                System.out.println(entry.getKey()+" - "+entry.getValue());
            }
    }
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str=sc.nextLine();
        //String str="computerscienceengineering";
        System.out.println("The occurrences of the characters in the given string is : ");
        count_char(str);
    }

}