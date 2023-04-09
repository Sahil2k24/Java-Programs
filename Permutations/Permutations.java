//Time Complextiy-->O(n!)

//Print the permutations of the given string

public class permutations{

public static void permit(String str, String combinations){

    if(str.length()==0)
    {
        System.out.println(combinations);
        return;
    }

    for(int i=0;i<str.length();i++){
        char currchar=str.charAt(i);

        String newstr=str.substring(0,i)+str.substring(i+1);
        permit(newstr, combinations+currchar);
    }

}
    public static void main(String[] args){

        String str="abdas";
        permit(str, "");

    }
}