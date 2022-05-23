//package DP;
import java.util.*;

public class editdist {

    //sunday
    //saturday
    
    static int ED(String s1, int m, String s2, int n, int[][] dp)
    {
        if(m == 0)
            return n;   
        if(n == 0)
            return m;
        if(dp[m][n] != -1)
            return dp[m][n];
        
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return dp[m][n] = ED(s1, m-1, s2, n-1, dp);
        
        else if (s1.charAt(m-1) != s2.charAt(n-1))
            return dp[m][n] = Math.min(1+ED(s1, m, s2, n-1, dp), Math.min(1+ED(s1, m-1, s2, n, dp),1+ED(s1, m-1, s2, n-1, dp)));

        return dp[m][n];
       // Math.min(Math.min(4,3),Math.min(2,5));
    }
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        System.out.println(ED(a, m, b, n, dp));
    }
}
