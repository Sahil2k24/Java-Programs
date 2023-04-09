//Print all the possible combinations for the given string using backtracking

public class backtrack1{

    public static void print(String str, String combinations, int index){
        if(str.length()==0){
            System.out.println(combinations);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            print(newstr, combinations+currchar, i+1);
        }
    }

    public static void main(String[] args){

        String str="ABC";
        print(str, "", 0);

    }
}