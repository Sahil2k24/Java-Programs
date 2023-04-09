
/*Rules for tower of hanoi
1)Only one disk transferred in one step
2)Smaller disks are always kept on top of the larger disks
*/

//Time Complexity --> O(2^n)

public class towerofhanoi{

    public static void toh(int n,String src,String help,String dest){

        if(n==1){
            System.out.println("Tranfer Disk "+n+" from "+src+" to "+dest);
            return;
        }

        toh(n-1,src,dest,help);
        System.out.println("Tranfer Disk "+n+" from "+src+" to "+dest);
        toh(n-1,help,src,dest);
    }

    public static void main(String[] args){

        int n=10;
        toh(n,"Source","Helper","Destination");

    }
}