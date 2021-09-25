import java.util.*;
public class io {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            //System.out.println(temp);
        }
        for (int i = 0; i < n; i++) {
            
            System.out.println(arr[i]);
        }
        //System.out.print(m + " " + n);

    }
}
