import java.util.*;

public class MergedLis {

    public static int lics(int[] arr){
        int streak = 1, longest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1])
            {
                streak++;
            }
            else
            {
                if(streak > longest)
                {
                    longest = streak;
                }
                streak = 1;
            }
        }
        if(streak > longest)
        {
            longest = streak;
        }
        return longest;
    }
    
    public static void main(String[] args) {
        
        // int[] arr = {6,7,7,8,3,4,4,5,5,2,1,1,2};
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] a = new int[m];
            int[] b = new int[n];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int ans = lics(a) + lics(b);
            System.out.println(ans);
        }

    }
}
