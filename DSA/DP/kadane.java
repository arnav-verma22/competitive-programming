// package DP;
import java.util.*;

public class kadane {
    
    static int maxprod(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        int prod = 1;
        int maxn = max;
        
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
            if(prod == 0)
                prod = 1;

            if(prod > max)
                max = prod;
        }
        // if(max == 0)
        //     return maxn;

        return max;
    }
    public static void main(String[] args) {
        int [] a = {5, 3, 1, 6, -8};
        System.out.println("Maximum contiguous prod is " +
                                       maxprod(a));
    }
}
