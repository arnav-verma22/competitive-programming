import java.util.*;

/*
Sample Output:
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9
*/

public class pattern2 {

    static void pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            int k = 1;
            if (i%2 == 0)
                k++; 

            for(int j = 1; j<= i; j++)
            {
                System.out.print(k + " ");
                k += 2;
            }

            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern(5);
    }
}
