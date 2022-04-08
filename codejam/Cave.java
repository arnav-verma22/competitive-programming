import java.util.*;

//package codejam;

public class Cave {

    static int[] teleport(int toroom, Scanner sc)
    {
        System.out.println("           T "+ toroom);
        int[] res = new int[2];
        res[0] = sc.nextInt();
        res[1] = sc.nextInt();
        return res;

    }
    static int[] pass_through(Scanner sc)
    {
        System.out.println("           W");
        int[] res = new int[2];
        res[0] = sc.nextInt();
        res[1] = sc.nextInt();
        return res;
    }
    static void guess(int npassages)
    {
        System.out.println("           E "+ npassages);
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int room = sc.nextInt();
            int passages = sc.nextInt();
            while(k > 0)
            {
                int[] res = new int[2];
                if(passages == 1)
                {
                    res = pass_through(sc);
                    k--;
                }
                //System.out.println(res[0]);
                if(k == 0)
                {
                    guess(4);
                }
            }
        }
        
        //System.out.println();

    }
}
