
public class recur1{
    //simple program
    /*public static void print(int n){
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        print(n-1);
    }*/


    //sum of n natural numbers
    /*public static void Sum(int i,int n,int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        Sum(i+1,n,sum);
    }*/

    //Factorial of a given number

    /*public static int factorial(int n){

        if(n==1 || n==0){
            return 1;
        }

        int f=factorial(n-1);
        int fact=n*f;
        return fact;
    }*/

     //Fibonacci Series

    /*public static void fibo(int a,int b,int n){
        
        if(n==0){
            return;
        }

        int c=a+b;
        System.out.println(c);
        fibo(b,c,n-1);*/

    //calculate x^n    

       /* public static int calpow(int x,int n){

            if(x==0){
                return 0;
            }

            if(n==0){
                return 1;
            }

            int xpownm1=calpow(x,n-1);
            int xpown=x*xpownm1;
            return xpown;

        }*/

        //calculate x^n in terms of logn(mathematically and not in code)

        public static int calpow(int x,int n){
            if(n==0){
                return 1;
            }

            if(x==0){
                return 0;
            }

            if(n % 2==0)
            {
                return calpow(x,n/2)*calpow(x,n/2);
            }
            else
            {
                return calpow(x,n/2)*calpow(x,n/2)*x;
            }
        }

    public static void main(String[] args){
        
        //int n=6;
        //int ans=factorial(n);         //for factorial
        //System.out.println(ans);
        
        //Sum(2,10,0);

        //int a=0;
        //int b=1;         //for fibonacci
        //int n=7;
        //System.out.println(a);
        //System.out.println(b);
        //fibo(a,b,n-2);

        int x=2;
        int n=6;                           //for both x^n
        int ans=calpow(x,n);
        System.out.println(ans);

    }
}