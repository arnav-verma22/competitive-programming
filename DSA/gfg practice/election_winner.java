import java.util.*;


public class election_winner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        while (n-- > 0) {
        
            int t = sc.nextInt();
            sc.nextLine();
            String votes = sc.nextLine();
            String[] votesarr = votes.split(" ");
            HashMap<String, Integer> candidates = new HashMap<String, Integer>();

            for (String vote : votesarr) {
                
                candidates.compute(vote, (key, val) -> (val == null) ? 1 : val + 1);
            }
            int max = 0;
            String winner = new String();
            for(Map.Entry m:candidates.entrySet())  
            {  
                int val = (Integer)m.getValue(); 
                String k = (String)m.getKey();
                if (val > max) {
                    winner = k;
                    max = val;
                }
                else if(val == max){
                    if(k.compareTo(winner) < 0)
                    {
                        winner = k;
                        max = val;
                    }
                }
                
            //    System.out.println(val);
            //    System.out.println(m.getKey()+" "+m.getValue());   
            }

            System.out.println(candidates); 
            System.out.println(winner);
        }
        sc.close();

    }
}
