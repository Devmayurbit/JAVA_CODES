import java.io.*;
import java.util.*;

public class day_11s {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int n = sc.nextInt();
            int[]  jerseyNumbers =new int[n];
            
            for(int i = 0 ; i<n ; i++){
                 jerseyNumbers[i]= sc.nextInt();
            }
            int expectedsum = n*(n+1)/2;
            int actualsum = 0;
            for(int i=0 ;i<n;i++){
                 actualsum = actualsum+jerseyNumbers[i];
            }
            int missingnumber= expectedsum -actualsum;
             System.out.println(missingnumber);
        }
       sc.close();
    }
}