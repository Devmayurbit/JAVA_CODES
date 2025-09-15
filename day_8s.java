import java.io.*;
import java.util.*;

public class day_8s {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0 ){
            int M = sc.nextInt();
              int X = sc.nextInt();
            int[] L = new int[M];
            for(int i = 0 ; i<M ; i++){
                L[i]=sc.nextInt();
            }
                Arrays.sort(L);
            
            int count=0;
            for(int i=0;i<M;i++){
                if(L[i] <= X){
                    count++;
                    X-=L[i];
                }
                else {
                    break;
                }

            }
                                        System.out.println(count);

        }
    sc.close();
    }
}