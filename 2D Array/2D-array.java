import java.util.*;

public class arraystwo{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rows and columns : ");
        System.out.println("Rows : ");
        int rows=sc.nextInt();
        System.out.println("Columns : ");
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];

        System.out.println("Enter the elements of array: ");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("2D Array is : ");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the number you want to search : ");
        int no=sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(no==a[i][j])
                {
                    System.out.println("Number is found at the location : ("+i+","+j+")");
                    return;
                }
                else
                {
                    System.out.println("Invalid number.");
                    return;
                }
            }
        }
    }
}