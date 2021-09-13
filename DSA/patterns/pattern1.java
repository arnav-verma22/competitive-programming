import java.util.*;
/*
Sample Output:
1 2 3 4 5
2 3 4 5 
3 4 5 
4 5 
5
*/
class pattern1
{

    static void pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j<= n; j++)
                System.out.print(j + " ");
            
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        pattern(5);
    }
}

