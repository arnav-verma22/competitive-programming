

import java.util.Scanner;

public class CookingSchedule {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] strArr = s.split("");
        strArr[1] = "1";
        System.out.println(strArr[0]);
        
    }
}
