import java.util.*;
class worthymatrix
{
    public static void main(String Args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int matrix[][] = new int[n][m];
            for(int i = 0;i < n; i++)
            {
                for(int j = 0;j < m; j++)
                    matrix[i][j] = sc.nextInt();
            }

            

            for(int i = 0;i < n; i++)
            {
                for(int j = 0;j < m; j++)
                    System.out.println(matrix[i][j]);
                System.out.println();
            }
        }
        //System.out.println(x + " " + y);
    }   
}