//package linkedlist;

import java.util.*;

public class kickstart {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k = 0; k<t; k++)
        {
            String num = sc.nextLine();
            int sum = 0;
            for(int i = 0; i<num.length(); i++)
            {
                sum += Integer.parseInt(String.valueOf(num.charAt(i)));
            }

            //System.out.println("sum of nos. "+sum);
            int mul = sum%9;
            int add = 9 - mul;
            if(mul == 0)
                add = 0;
            char c=(char)(add+'0');
            //System.out.println("to be addedd: "+c);
            
            String added=null;
            Boolean addedc = false;
            // System.out.println(added);
            for(int i = 0; i<num.length(); i++)
            {
                if(add < Integer.parseInt(String.valueOf(num.charAt(i))))
                {
                    added = num.substring(0, i)+c+num.substring(i);
                    addedc = true;
                    break;
                }
            }
            if(!addedc)
            {
                added =  num + c;
            }
            int tc = k+1;
            System.out.println("Case #"+tc+": "+Long.parseLong(added));
        }
    }
}
