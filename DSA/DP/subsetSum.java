//package DP;
import java.util.*;

public class subsetSum {
    
    static Boolean subset_sum(int[] arr, int ind, int target)
    {
        if(ind < 0)
            return false;

        //System.out.println(arr[ind] + " " + target);
        if(target == 0)
            return true;
        

        if(arr[ind] > target)
            return subset_sum(arr,ind - 1, target);

        if(arr[ind] <= target)
        {
            return subset_sum(arr, ind - 1, target) || subset_sum(arr, ind - 1, target - arr[ind]);
        }
        
        return false;
    }
    public static void main(String[] args) {
        int [] a = {50, 71, 53, 75, 49, 86, 20, 12, 79, 7};
        System.out.println(
                                       subset_sum(a, a.length - 1, 25));
    }
}
