//Move all x at the end of the string
//Time Complexity-->O(n)

public class move{

    public static void movex(String str,int index,int count, String newstring){

        if(index==str.length()){
            for(int i=0;i<count;i++)
            {
                newstring+='x';
            }
            System.out.println(newstring);
            //System.out.println(count);
            return;
        }

        char currchar=str.charAt(index);

        if(currchar=='x')
        {
            count++;
            movex(str, index+1, count, newstring);
        }
        else
        {
            newstring=newstring+currchar;
            movex(str, index+1, count, newstring);
        }

    }


    public static void main(String[] args){

        String str="acxvgfgxxdx";
        movex(str, 0, 0, "");
    }
}