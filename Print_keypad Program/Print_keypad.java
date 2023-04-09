//Print the combinations from the keypad
//Time Complexity-->O(4^n)

public class keypad{

    public static String[] key={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keycom(String str, int index, String combination){

        if(index==str.length()){
            System.out.println(combination);
            return;
        }

        char currchar=str.charAt(index);
        String mapping=key[currchar-'0'];

        for(int i=0;i<mapping.length();i++)
        {
            keycom(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){

        String str="12";
        keycom(str, 0, "");

    }
}