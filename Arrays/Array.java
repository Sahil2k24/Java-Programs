import java.util.*;

public class array{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        int[] a=new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Elements of the array : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Maximum Value: "+max);
        System.out.println("Minimum Value: "+min);

        System.out.println("Enter the element to be searched : ");
        int no=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {
            if(no==a[i])
            {
                System.out.println("Index of the element is : "+i);
                return;
            }
            else
            {
                System.out.println("Invalid no");
                return;
            }
            }
        
    }
}