
import java.io.*;
import java.util.*;

public class day_14s  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in); 
    int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int time = sc.nextInt();
            
        int cycleLength = 2 * (n - 1); 
            int remainTime = time % cycleLength;
            
            int position =1;
            if(remainTime < n){
                position = 1+ remainTime;
            }else{
                position = n - (remainTime - (n-1));
            }
            System.out.println(position);
        }
    }
}
