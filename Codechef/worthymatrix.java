import java.util.*;

class worthymatrix
{
    public static int submatrix_sum(int matrix[][], int x, int y, int l)
    {
        int sum = matrix[x+l][y+l] + matrix[x-1][y-1] - matrix[x+l][y-1] - matrix[x-1][y+l];
        int size = (l+1)*(l+1), avg = sum/size;
        return avg;
    }
    public static int find_min_l(int matrix[][], int x, int y, int k)
    {
        int l = 0, r = Math.min(matrix.length - x, matrix[1].length - y) - 1, max_size = r+1, mid = 0, avg = submatrix_sum(matrix, x, y, l);
        boolean any_worthy = false;
        System.out.println("for "+x+", "+y+" max possible length: "+max_size);

        if(avg >= k)
        {
            System.out.println("with l = 0 avg is "+ avg);
            any_worthy = true;
        }

        else
        {
            while(mid != r)
            {
                mid = (l+r+1)/2;
                System.out.println(" with l = : " + mid);
                avg = submatrix_sum(matrix, x, y, mid);
                if(avg >= k)
                {
                    System.out.println(" is worthy cuz avg is "+ avg);
                    r = mid;
                    any_worthy = true;
                }
                else if(avg < k)
                {
                    l = mid;
                    System.out.println(" is not worthy cuz avg is "+ avg);
                }

            }
        }
        
        if(any_worthy)
        {
            System.out.println("min l: " + mid+ "worthy matrices: "+ (max_size - mid));
            return max_size - mid;
        }    
        else
        {
            System.out.println("min l: " + mid+ "worthy matrices: 0");
            return 0;
        }
    }
    public static void main(String Args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int worthy_matrix = 0;
        while(t-- > 0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int matrix[][] = new int[n+1][m+1];
            for(int i = 1;i <= n; i++)
            {
                for(int j = 1;j <= m; j++)
                    matrix[i][j] = sc.nextInt();
            }

            //prefix matrix
            for (int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= m; j++)
                {
                    matrix[i][j] += matrix[i-1][j] + matrix[i][j-1] - matrix[i-1][j-1];                    
                }
            }

            for (int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= m; j++)
                {
                    worthy_matrix += find_min_l(matrix, i, j, k);                    
                }
            }
            //worthy_matrix = (3+4)/2;
            System.out.println(worthy_matrix);


            for(int i = 0;i <= n; i++)
            {
                for(int j = 0;j <= m; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
        }
        
    }   
}