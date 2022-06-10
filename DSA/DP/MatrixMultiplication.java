package DP;
import java.util.*;

public class MatrixMultiplication {
    
    static int MCM(int[] dims, int i, int j, int[][] dp)
    {

        
        for(int k = 0; k < j; k++)
            dp[i][j] = Math.min(dp[i][j],MCM(dims, i, k, dp) + MCM(dims, k, j, dp) + (dims[i]*dims[k]*dims[j]));

        return dp[i][j];
    }
    public static void main(String[] args) {
        
        int[][] dp = new int[6][6];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);
    }
}
