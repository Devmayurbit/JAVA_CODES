import java.util.*;

public class day_13s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            int n = sc.nextInt(); // Number of players already in the team
            int k = sc.nextInt(); // Number of players to recruit

            Set<Integer> teamLineup = new HashSet<>();
            for (int i = 0; i < n; i++) {
                teamLineup.add(sc.nextInt());
            }

            long cost = 0;
            int nextJersey = 1;

            while (k > 0) {
                if (!teamLineup.contains(nextJersey)) {
                    cost += nextJersey;
                    k--;
                }
                nextJersey++;
            }

            result.append(cost).append("\n");
        }

        System.out.print(result);
        sc.close();
    }
}
