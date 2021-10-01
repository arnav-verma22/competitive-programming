import java.util.*;

public class ValidString {

    public static void main(String[] args) {

        //Stack<Integer> stk = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            Stack<Integer> stk = new Stack<>();

            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            //sc.next();

            //System.out.println(str);
            for (int i = 0; i < n; i++) {
                int c = Character.getNumericValue(str.charAt(i));
                if(c == 0)
                {
                    stk.push(c);
                }
                else 
                {
                    if(!stk.empty() && stk.peek() == 0)
                    {
                        stk.pop();
                    }
                    else 
                        stk.push(c);
                }
                
                
            }
            if(stk.empty())
                System.out.println("yes");
            
            else
                System.out.println("no");
            
            
            //sc.next();
            System.out.println("Elements in Stack: " + stk);
        }
    }
    
}
