//package DP;
import java.util.*;
public class LCS {
    
    static int lcs(String s1, int n, String s2, int m, int[][] dp)
    {
        if(n == 0 || m == 0)
            return 0;

        if(dp[n][m] != -1)
            return dp[n][m];

        else
        {
            if(s1.charAt(n-1) == s2.charAt(m-1))
            {
                return dp[n][m] = lcs(s1, n-1, s2, m-1, dp) + 1;
            }
            if(s1.charAt(n-1) != s2.charAt(m-1))
            {   
                return dp[n][m] = Math.max(lcs(s1, n-1, s2, m, dp), lcs(s1, n, s2, m-1, dp));
            }
        }

        return dp[n][m];
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = a.length();
        int m = b.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        
        System.out.println(lcs(a, n, b, m, dp));
    }
}
