public class day_17s {
      // Function to validate if we can pick k sandstones with at least 'minDifference'
    private static boolean canPickKSandstones(int[] rarity, int k, int minDifference) {
        int count = 1; // Start by picking the first sandstone
        int lastPicked = rarity[0];

        for (int i = 1; i < rarity.length; i++) {
            if (rarity[i] - lastPicked >= minDifference) {
                count++;
                lastPicked = rarity[i];
                if (count == k) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to find the maximum best match value
    private static int getMaxBestMatchValue(int[] rarity, int k) {
        Arrays.sort(rarity); // Sort the rarity values
        int low = 0; // Minimum possible difference
        int high = rarity[rarity.length - 1] - rarity[0]; // Maximum possible difference
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPickKSandstones(rarity, k, mid)) {
                result = mid; // Update result if valid
                low = mid + 1; // Try for a larger minimum difference
            } else {
                high = mid - 1; // Reduce the range
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int T = scanner.nextInt();

        while (T-- > 0) {
            // Read N and k
            int N = scanner.nextInt();
            int k = scanner.nextInt();

            // Read rarity values
            int[] rarity = new int[N];
            for (int i = 0; i < N; i++) {
                rarity[i] = scanner.nextInt();
            }

            // Find and print the maximum best match value
            System.out.println(getMaxBestMatchValue(rarity, k));
        }

        scanner.close();
        
    }
}

