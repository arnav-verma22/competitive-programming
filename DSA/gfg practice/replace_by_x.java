import java.util.*;

public class replace_by_x {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {

            String s = sc.nextLine();
            String p = sc.nextLine();
            
            s = s.replaceAll("X", "Y");
            s = s.replaceAll(p, "X");
            while(s.contains("XX"))
                s = s.replaceAll("XX", "X");
                
            s = s.replaceAll("Y", "X");
            System.out.println(s);
        }
        
        sc.close();

    }
}
