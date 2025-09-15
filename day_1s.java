
import java.util.*;


public class day_1s {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] S = new int[N];

            int eventCount = 0, oddCount = 0;
            for (int i = 0; i < N; i++) {
                S[i] = scanner.nextInt();
                if (S[i] % 2 == 0) {
                    eventCount++;
                } else {
                    oddCount++;
                }
            }

            if (eventCount > oddCount) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}
