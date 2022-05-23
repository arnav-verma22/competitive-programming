//package DP;
import java.util.*;
public class CoinChange {

    static int countways_rec(int[] s, int n, int value, int[][] table)
    {
        if(value < 0)
            return 0;
        
        if(value == 0)
            return table[n][value] = 1;
        if(n == 0)
            return 0;
        
        if (table[n][value] != -1)
            return table[n][value];
        
        
        return table[n][value] = countways_rec(s, n-1, value, table) + countways_rec(s, n, value-s[n-1], table);
        
        
        
    }

    static long countways_bottomup(int[] s, int n, int value)
    {
        long[] ways = new long[value+1];
        ways[0] = 1;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < value+1; j++)
            {
                //System.out.print("coin: " + s[i] +" value: " + j);
                if(j >= s[i])
                {
                    ways[j] += ways[j - s[i]];
                }
                //System.out.println(" ways =  " + ways[j]);
            }
        }
        return ways[value];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        int v = 45;
        int[][] dp = new int[n + 1][v + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(countways_rec(arr, n, v, dp));
        //System.out.println(countways_bottomup(arr, n, v));
    }
}
