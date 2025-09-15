import java.util.*;


class day_2s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[] H = new int[N];
            int[] A = new int[M];
            
            for (int i = 0; i < N; i++) {
                H[i] = scanner.nextInt();
            }
            
            for (int i = 0; i < M; i++) {
                A[i] = scanner.nextInt();
            }
            
            Map<Integer, Integer> luckiness = new HashMap<>();
            for (int peak : H) {
                for (int num : A) {
                    if (peak % num == 0) {
                        luckiness.put(num, luckiness.getOrDefault(num, 0) + 1);
                    }
                }
            }
            
            int maxScore = Collections.max(luckiness.values());
            List<Integer> maxScoreNumbers = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : luckiness.entrySet()) {
                if (entry.getValue() == maxScore) {
                    maxScoreNumbers.add(entry.getKey());
                }
            }
            
            System.out.println(Collections.min(maxScoreNumbers));
        }
    }
}
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of peaks
            int M = scanner.nextInt(); // Number of auspicious numbers
            
            int[] H = new int[N]; // Heights of peaks
            int[] A = new int[M]; // Auspicious numbers
            
            for (int i = 0; i < N; i++) {
                H[i] = scanner.nextInt();
            }
            
            for (int i = 0; i < M; i++) {
                A[i] = scanner.nextInt();
            }
            
            // Map to store luckiness score for each auspicious number
            Map<Integer, Integer> luckiness = new HashMap<>();
            
            // Calculate luckiness scores
            for (int num : A) {
                luckiness.put(num, 0); // Initialize with 0
                
                for (int peak : H) {
                    if (peak % num == 0) {
                        luckiness.put(num, luckiness.get(num) + 1);
                    }
                }
            }
            
            // Find the auspicious number with maximum luckiness score
            int maxScore = -1;
            int bestNumber = Integer.MAX_VALUE;
            
            for (Map.Entry<Integer, Integer> entry : luckiness.entrySet()) {
                int num = entry.getKey();
                int score = entry.getValue();
                
                // Update if a higher score is found or if scores are equal but the number is smaller
                if (score > maxScore || (score == maxScore && num < bestNumber)) {
                    maxScore = score;
                    bestNumber = num;
                }
            }
            
            // Print the result for the current test case
            System.out.println(bestNumber);
        }
        
        scanner.close();
    }
}
 */