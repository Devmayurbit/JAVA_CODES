import java.io.*;
import java.util.*;

public class day_7s  {

    public static void main(String[] args) {
      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character
        
        while (T-- > 0) {
            String S = sc.nextLine();
            String[] parts = S.split("[~!@#$%^&*()_+]+");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}


