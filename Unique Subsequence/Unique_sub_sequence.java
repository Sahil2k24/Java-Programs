//Print all the unique subsequences of the given string

import java.util.HashSet;

public class unique_sub_sequence{

    public static void unique(String str,int index,String newstring,HashSet<String> set){

        if(index==str.length()){
            if(set.contains(newstring)){
                return;
            }
            else
            {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }

        char currchar=str.charAt(index);

        //to be
        unique(str, index+1, newstring+currchar, set);

        //to not to be
        unique(str, index+1, newstring, set);

    }

    public static void main(String[] args){

        String str="aaaa";
        HashSet<String> set=new HashSet<>();

        unique(str, 0, "", set);
    }
}