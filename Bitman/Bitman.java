import java.util.*;

public class bitman{
    public static void main(String[] args){

        int n=5;
        int pos=0;
        int bitmask=1<<pos;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to perform Set operation else Clear opeartion.");
        int oper=sc.nextInt();

        //Get operation-- use AND operator
        //Get is used to access the bit and check whether it is zero or one.

        /*if((bitmask & n)==0)
        {
            System.out.println("Bit is zero.");
        }
        else
        {
            System.out.println("Bit is One.");
        }*/

        //Set operation-- use OR operator
        //Set is is used to set a particular bit as one 

        /*int no=(bitmask | n);
        System.out.println(no); */

        //Clear operation-- use AND, NOT operator
        //Clear is used to set the particular bit as zero
        //1st step-- NOT the bitmask and save it to nbitmask
        //2nd step-- then use AND operator on nbitmask and original number
    
        /*int nbitmask=~(bitmask);

        int no=(nbitmask & n);
        System.out.println(no); */

        //Update operation-- combination of set and clear operation

        if(oper==1)
        {
            int no=(bitmask | n);
            System.out.println(no);
        }
        else
        {
            int nbitmask=~(bitmask);
            int no=(nbitmask & n);
            System.out.println(no);
        }

    }
}