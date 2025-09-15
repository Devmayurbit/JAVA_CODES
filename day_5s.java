import java.util.Scanner;

public class day_5s {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int N = sc.nextInt();

            int[] L = new int[N];
            for(int i = 0 ; i < N ; i++){
                L[i] = sc.nextInt();
        }
        int result = balance(L,N);

        System.out.println(result);
        }
        sc.close();
    }
    public static int balance(int[] L , int N){
        int totalsum = 0 , leftsum = 0;

        for(int supply : L){
           totalsum += supply;
        }
       
        for(int i = 0 ; i<N ; i++){
            int rightsum = totalsum - leftsum - L[i];

            if(leftsum == rightsum){
                return i;
            }
            leftsum += L[i];
        }
        return -1;
    }
}
