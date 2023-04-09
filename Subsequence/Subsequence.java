//Print all the subsequences of the given string in the given order of thye strings
//imp for placement
//Total no of subsequences will be--.2^n
//Time Complexity-->O(2^n)

public class subsequence{

    public static void sub(String str, int index, String newstring){

        if(index==str.length()){
            System.out.println(newstring);
            return;
        }

        char currchar=str.charAt(index);

        //if the char wants to be in the given subsequence

        sub(str, index+1, newstring+currchar);

        //if the char wants to be in the given subsequence

        sub(str, index+1, newstring);
    }

    public static void main(String[] args){

        String str="abcdefg";

        sub(str, 0, "");

    }
}