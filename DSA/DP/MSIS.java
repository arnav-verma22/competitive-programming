//package DP;
import java.util.*;

public class MSIS {
    
    static int max_subseq(int[] arr)
    {
        int sum[] = new int[arr.length];
        Arrays.fill(sum, 0);
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i])
                {
                    sum[i] = Math.max(sum[i], sum[j] + arr[i]);
                }
                else
                    sum[i] = Math.max(sum[i], arr[i]);
            }
        }
        int max = sum[0];
        for (int i = 1; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
            if(sum[i]>max)
                max = sum[i];
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {1, 101, 2, 3, 100, 4, 5};
        //int n = arr.length;
        System.out.println("Sum of maximum sum "+
                            "increasing subsequence is "+
                              max_subseq(arr));
    }
}
