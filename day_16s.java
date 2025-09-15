import java.util.*;

public class SortCliffs {

    // Function to count the number of 1's in the binary representation of a number
    private static int countOnesInBinary(int x) {
        return Integer.bitCount(x);
    }

    // Function to sort cliffs by spirit energy
    private static List<Integer> sortCliffs(List<Integer> cliffs) {
        cliffs.sort((a, b) -> {
            int onesA = countOnesInBinary(a);
            int onesB = countOnesInBinary(b);
            if (onesA == onesB) {
                return Integer.compare(a, b);
            }
            return Integer.compare(onesA, onesB);
        });
        return cliffs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int t = 0; t < T; t++) {
            // Number of cliffs
            int N = scanner.nextInt();

            // Read difficulty scores
            List<Integer> cliffs = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                cliffs.add(scanner.nextInt());
            }

            // Sort cliffs by spirit energy
            List<Integer> sortedCliffs = sortCliffs(cliffs);

            // Output the sorted cliffs
            for (int i = 0; i < sortedCliffs.size(); i++) {
                System.out.print(sortedCliffs.get(i));
                if (i < sortedCliffs.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
