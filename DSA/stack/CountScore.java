import java.util.*;
public class CountScore {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] scores = new int[n];
            int[] min = new int[n];
            for (int i = 0; i < n; i++) 
            {
                scores[i] = sc.nextInt();
            }
            Stack<Integer> stk = new Stack<Integer>();
            stk.push(1);
            for (int i = 1; i < scores.length; i++)
            {
                
                if(scores[i] >= scores[stk.peek()-1])
                    stk.push(i+1);
                else
                {
                    while(!stk.empty() && scores[i] < scores[stk.peek()-1])
                    {
                        min[stk.pop()-1] = i+1;
                    }
                    stk.push(i+1);
                }       
            }
            System.out.println("Elements in Stack: " + stk);
            int x = 0;
            while (!stk.empty())
            {
                min[stk.pop()-1] = -1;
            }
            
            for (int i = 0; i < scores.length; i++) {
                System.out.print(min[i] + " ");
            }
        }
    }
}
