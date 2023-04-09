//Print the elements in the strictly increasing order.
//Time Complexity -->O(n)

public class sorted{

    public static boolean sort(int a[], int index){

        if(index==a.length-1)
        {
            return true;
        }

        if(a[index]<a[index+1])
        {
            return sort(a,index+1);
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args){

        int a[]={1,7,8,9};
        System.out.println(sort(a,0));

    }
}