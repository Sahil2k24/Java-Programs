//Perform the merge sort algorithm
//Divide and Conquer
//Time Complexity-->O(nlogn)

import java.util.*;

public class mergesort{

    public static void conquer(int[] a, int si,int mid, int ei)
    {
        int[] merge=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int x=0;

        while(index1<=mid && index2<=ei)
        {
            if(a[index1] <= a[index2])
            {
                merge[x]=a[index1];
                x++;
                index1++;
            }
            else
            {
                merge[x]=a[index2];
                x++;
                index2++;
            }
        }

        while(index1<=mid){
            merge[x]=a[index1];
            x++;
            index1++;
        }

        while(index2<=ei)
        {
            merge[x]=a[index2];
            x++;
            index2++;
        }

        for(int i=0,j=si ; i<merge.length ; i++,j++ )
        {
            a[j]=merge[i];
        }

    }

    public static void divide(int[] a, int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }

        int mid=si + (ei-si) /2;     //instead of taking si-ei
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conquer(a, si, mid, ei);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the length of the array : ");
        int l=sc.nextInt();

        int[] a=new int[l];

        System.out.println("Enter the elements of the array : ");

        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        //int[] a={3,2,7,123,345,678,23,11,9,1231,6,9,8,1};
        int n=a.length;

        divide(a, 0, n-1);

        System.out.println("Sorted order is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}