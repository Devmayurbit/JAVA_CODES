import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * day_4s
 */
public class day_4s {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxSum = sc.nextInt();
        int bannedSize = sc.nextInt();

        Set<Integer> banned = new HashSet<>();
        for(int i = 0; i<bannedSize;i++){
               banned.add(sc.nextInt());
        }
        int count = 0;
        int currentSum = 0;

        for(int i = 1 ; i<=n; i++){
          if(!banned.contains(i) && currentSum <= maxSum){
            currentSum += i;
            count++;
          }
        }
        System.out.println(count);
        sc.close();
    }
}