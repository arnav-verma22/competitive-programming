
import java.util.*;

public class Tricoin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (n > 0) {
            i++;
            n -= i;
            
            System.out.println(i+" "+n);
        }
        System.out.println(i);
    }
}
