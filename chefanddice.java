import java.util.*;
class chefanddice
{
    public static void main(String Args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        for(int i = 0; i < y; i++)
        {
            int n = sc.nextInt();
            int layers = n/4;
            n = n % 4;
            int pips = 44*layers;
            if(n == 3)
                pips += 51;
            else if(n == 2)
                pips += 36;
            else if(n == 1)
                pips += 20;
            else if(n == 0)
                pips += 60;
            System.out.println(layers + " " + n + " " + pips);
        }

    }
}