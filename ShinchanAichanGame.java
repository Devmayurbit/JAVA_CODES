import java.util.Scanner;

public class ShinchanAichanGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases
        sc.nextLine();  // Consume the newline character
        
        while (T-- > 0) {
            String num = sc.nextLine();
            int n = num.length();
            int half = n / 2;
            int leftSum = 0, rightSum = 0;
            int leftQ = 0, rightQ = 0;
            
            // Analyze the string
            for (int i = 0; i < half; i++) {
                if (num.charAt(i) == '?') {
                    leftQ++;
                } else {
                    leftSum += num.charAt(i) - '0';
                }
            }
            for (int i = half; i < n; i++) {
                if (num.charAt(i) == '?') {
                    rightQ++;
                } else {
                    rightSum += num.charAt(i) - '0';
                }
            }
            
            // Compute the difference in '?' counts
            int diffQ = leftQ - rightQ;
            int diffSum = leftSum - rightSum;

            // Determine the result
            if (diffQ == 0) {
                // Same number of '?' in both halves
                System.out.println(diffSum == 0 ? "Aichan" : "Shinchan");
            } else if (diffQ > 0) {
                // More '?' in the left half
                int maxLeftSum = diffSum + (diffQ / 2) * 9;
                System.out.println(maxLeftSum == 0 ? "Aichan" : "Shinchan");
            } else {
                // More '?' in the right half
                int maxRightSum = -diffSum + (-diffQ / 2) * 9;
                System.out.println(maxRightSum == 0 ? "Aichan" : "Shinchan");
            }
        }
        sc.close();
    }
}   