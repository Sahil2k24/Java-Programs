import javax.crypto.SecretKeyFactorySpi;

//Print the total number of paths of the maze going from (0,0) to (m,n)
//Here m and n are the no of rows and cols for the maze/matrix
/*Rules for the maze:

1) The direction should be from left to right
2) The direction should be downward
3)Path cannot be upperward, left or diagonally
*/

public class paths{

    public static int countpaths(int i,int j,int m,int n){

        if(i==m || j==n){
            return 0;
        }

        if(i==(m-1) && j==(n-1)){
            return 1;
        }

        //for downwards
        int down=countpaths(i+1, j, m, n);

        //for rightwards
        int right=countpaths(i, j+1, m, n);

        return down+right;

    }

    public static void main(String[] args){

        int m=3;
        int n=3;

        int totalpaths=countpaths(0, 0, m, n);
        System.out.println("Total no of paths : "+totalpaths);

    }
}
 