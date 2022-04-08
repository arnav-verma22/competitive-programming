
import java.util.*;
public class Mineat {
    
    public static int k_largest(int k, int arr[])
    {
        // ArrayList<Integer> al = Arrays.asList(arr);
        // Collection.sort(al);
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            
        
            int n = sc.nextInt();
            int h = sc.nextInt();
            ArrayList<Integer> piles = new ArrayList<Integer>();
            // piles.add(23);
            for (int i = 0; i < n; i++) {
                piles.add(sc.nextInt());
            }
            
            Collections.sort(piles);

            // for(Integer number:piles)  
            // System.out.print(number);

            int extrahours = h - n;
            int k = n - extrahours - 1;

            System.out.println(piles.get(k));
        }

    }
}
