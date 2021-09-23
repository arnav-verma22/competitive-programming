import java.util.*;

/*
Sample Output:
          1
        1  1
      1  2  1
    1  3  3 1
 1   4  6  4  1

*/

public class pattern3 {
    static String middlepattern(int n)
    {
        if(n == 1)
            return "1 1";
        String str = middlepattern(n-1);
        String[] arrOfStr = str.split(" ");

        String res = "";
        for (int i=0; i<arrOfStr.length; i++)
        {
            
        }

        return str;
    }

    static void pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j<= n; j++)
            {
                System.out.print(" ");
            }


            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
        //pattern(5);    
        
        String str = "geekss for geekss ";
        String[] arrOfStr = str.split(" ");
  
        for (String a : arrOfStr)
            System.out.println(a);
        
    }
}
