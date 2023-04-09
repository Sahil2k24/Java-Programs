
public class selection{

    public static void printarr(int a[])
    {
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
    }
    public static void main(String[] args){

        int a[]={21,5,88,3,1};

        for(int i=0;i<a.length-1;i++)
        {
            int small=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[small]>a[j])
                {
                    small=j;
                }
            }
            int temp=a[small];
            a[small]=a[i];
            a[i]=temp;
        }

        printarr(a);

        //Time complexity--O(n^2)
    }
}