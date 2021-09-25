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

        String mid = "";
        for (int i=0; i<arrOfStr.length - 1; i++)
        {
            int sum = Integer.parseInt(arrOfStr[i]) + Integer.parseInt(arrOfStr[i+1]);
            mid += sum + " ";
        }
        String res = "1 " + mid + "1";
        return res;
    }

    static void pattern(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j<= n; j++)
            {
                System.out.print(" ");
            }
            if(i == 1)
                System.out.print("1");
            
            else   
                System.out.print(middlepattern(i-1));


            System.out.println();
        }
    }
    public static void main(String args[]) 
    {       
        //System.out.println(middlepattern(4));
        pattern(8);
        
    }
}
