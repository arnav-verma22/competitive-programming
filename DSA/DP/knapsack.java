//package DP;
import java.util.*;
public class knapsack {

    //this is the greedy approach
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Float> values = new ArrayList<Float>();
        ArrayList<Float> wts = new ArrayList<Float>();
        ArrayList<Float> vpw = new ArrayList<Float>();
        
        
        for (int i = 0; i < n; i++) {
            values.add(sc.nextFloat());
        }
        Map<Float, Float> vpwwt = new HashMap<Float, Float>();
        for (int j = 0; j < n; j++) {
            //values[i] = sc.nextInt();
            wts.add(sc.nextFloat());
            
        }
        for (int k = 0; k < n; k++) {
            vpw.add(values.get(k)/wts.get(k));
            System.out.println(values.get(k)+" "+wts.get(k)+" "+vpw.get(k));
            //vpwwt.put(vpw[k], wts[k]);
        }

        

        int cap = sc.nextInt();
        //System.out.println(max_vpw);
        float max_val = 0;

        while (cap > 0) {
            int max_vpw = vpw.indexOf(Collections.max(vpw));
            if(wts.get(max_vpw) <= cap)
            {
                max_val += values.get(max_vpw);
                
            }
            if(wts.get(max_vpw) > cap)
            {
                max_val += values.get(max_vpw)*(cap/wts.get(max_vpw));
            }
            cap -= wts.get(max_vpw);
            vpw.remove(max_vpw);
            values.remove(max_vpw);
            wts.remove(max_vpw);
        }
        System.out.println("max value; " + max_val);


        // for(Map.Entry m:sorted.entrySet()){ 
        //     System.out.println("vpw and wt");   
        //     System.out.println(m.getKey()+" "+m.getValue());    
        // }

        // for (int i = 0; i < vpw.length; i++) {
        //     System.out.println(vpw[i]);
        // }   


    }
}
