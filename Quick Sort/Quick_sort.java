//Perform the Quick Sort Algorithm
//Time Complexity-->
//Worst case--> O(n^2)
//Average Case-->O(nlogn)

/****************************IMPORTANT*********************************
WHEN DOES THE WORST CASE APPEARS:-
--> Worst Case occurs when the pivot is always the smallest or the largest element.
i.e, when the array is completely sorted.
***********************************************************************/

public class quicksort{

    public static int partition(int[] a, int low, int high){

        int pivot=a[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot){
                i++;                            //increment
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;                      
            }
        }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i;
    }

    public static void quick(int[] a, int low, int high){
        if(low<high)
        {
            int pivotindex=partition( a,low, high);
            quick(a, low, pivotindex-1);
            quick(a, pivotindex+1, high);
        }
    }

    public static void main(String[] args){

        int[] a={3,2,6,1,8,9,2,3,5,8,4,2,1,2,6,7,8,12,3332,34,5532,2};
        int n=a.length;

        quick(a, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
