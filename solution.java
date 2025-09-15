import java.io.*;
import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int T = sc.nextInt();
       
        int maxN = 0;
        int[] testCases = new int[T];
        for (int i = 0; i < T; i++) {
            testCases[i] = sc.nextInt();
            maxN = Math.max(maxN, testCases[i]);
        }
      
        List<Integer> primePowers = computePrimePowers(maxN);

        boolean[] dp = new boolean[maxN + 1];
        for (int i = 1; i <= maxN; i++) {
            for (int power : primePowers) {
                if (power > i) break;
                if (!dp[i - power]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        for (int n : testCases) {
            System.out.println(dp[n] ? "BarbarianKing" : "ArcherQueen");
        }
    }

    private static List<Integer> computePrimePowers(int maxN) {
        List<Integer> primePowers = new ArrayList<>();
        boolean[] isPrime = new boolean[(int) Math.sqrt(maxN) + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int p = 2; p < isPrime.length; p++) {
            if (isPrime[p]) {
                long power = p;
                while (power <= maxN) {
                    primePowers.add((int) power);
                    power *= p;
                }
            }
        }

        return primePowers;
    }
}