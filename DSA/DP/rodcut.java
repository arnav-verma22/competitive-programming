//package DP;
import java.util.*;
public class rodcut {
    
    static int CutPeices(int[] arr, int n, int length, int price)
    {
        
        if(n == 0)
            return 0;

        //System.out.println(arr[n-1] +" lenght left: "+ length);
        if(length == 0)
            return 0;
        
        if(n == 1)
            return length*arr[n-1];
        

        if(n > length)
        {
            price = CutPeices(arr, n-1, length,price);
        }
        if(n <= length)
        {
            price = Math.max(CutPeices(arr, n-1, length, price), CutPeices(arr, n, length-(n),price)+arr[n-1]);
        }
        //return table[n][value] = countways_rec(s, n-1, value, table) + countways_rec(s, n, value-s[n-1], table);
        return price;
    }
    public static void main(String[] args) {
        int [] a = {3 ,5 ,6 ,7 ,10, 12};
        int lengthOfRod =  a.length;
        System.out.println(CutPeices(a, lengthOfRod, lengthOfRod, 0));
        
    }
}
