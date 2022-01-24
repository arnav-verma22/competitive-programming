import java.util.*;

public class string_ignorance {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            
            String s = sc.nextLine();
            String ns = "";
            LinkedList<Character> l = new LinkedList<Character>();
            
            //System.out.println(l);

            for (int i = 0; i < s.length(); i++) {
                
                Character c = s.charAt(i);
                //System.out.println(c);
                int index = l.indexOf(c),indexc = -1;
                if(Character.isLowerCase(c))
                    indexc = l.indexOf(Character.toUpperCase(c));
                
                else if(Character.isUpperCase(c))
                    indexc = l.indexOf(Character.toLowerCase(c));

                if(index == -1 && indexc == -1)
                {
                    l.add(c);
                    ns += c;
                }
                else{
                    if(index >= 0)
                        l.remove(index);
                    if(indexc >= 0)
                        l.remove(indexc);
                }
                    
            }
            sc.close();
            System.out.println(ns);
        }
        
    }
}
