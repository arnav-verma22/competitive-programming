

import java.util.*;
import java.lang.Math;

public class forestga {

    static double total_woods(double month, int[] h, int[] r, int l)
    {
        double woods = 0;
        for(int i = 0; i < h.length; i++)
        {
            double height = h[i] + r[i]*month;
            if(height>=l)
            {
                woods += height;
            }
        
        }
        System.out.println("total wood: "+woods);
        return woods;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int l = sc.nextInt();
        int h[] = new int[n];
        int r[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        double min = 0, mid, woods;

        double max = (double) Math.pow(10,18) + 1;
        System.out.println(max);
        while(min < max)
        {
            mid = min + (max-min)/2;
            System.out.println("month: "+mid);
            woods = total_woods(mid, h, r, l);
            if(woods >= w)
            {
                max = mid-1;
            }
            else
            {
                min = mid+1;
            }

        }


    }
}
