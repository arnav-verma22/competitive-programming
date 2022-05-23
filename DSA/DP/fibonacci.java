//package DP;

public class fibonacci {

    static int fib(int n, int fibo[])
    {
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        if(fibo[n-1] == 0)
        {
            System.out.println(n-1+" not present in array");
            fibo[n-1] = fib(n-1, fibo);
        }
        // if(fibo[n-2] == 0)
        // {
        //     System.out.println(n-2+" n-2 not present in array");
        //     fibo[n-1] = fib(n-2, fibo);
        // }
        fibo[n] = fibo[n - 1] + fibo[n-2];
        return fibo[n];
        
    }

    public static void main(String args[])
    {
        int[] fibo = new int[100];
        int res = fib(10, fibo);
        System.out.println(res);
        for(int i = 0; i <= 10; i++)
            System.out.print(fibo[i]+" ");
    }
}
