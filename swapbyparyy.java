import java.io.*;
import java.util.*;

public class swapbyparyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            String numStr = String.valueOf(num);

            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for (char c : numStr.toCharArray()) {
                int digit = c - '0';
                if (digit % 2 == 0) {
                    even.add(digit);
                } else {
                    odd.add(digit);
                }
            }

            even.sort(Collections.reverseOrder());
            odd.sort(Collections.reverseOrder());

            StringBuilder result = new StringBuilder();
            int evenIndex = 0, oddIndex = 0;

            for (char c : numStr.toCharArray()) {
                int digit = c - '0';
                if (digit % 2 == 0) {
                    result.append(even.get(evenIndex++));
                } else {
                    result.append(odd.get(oddIndex++));
                }
            }

            System.out.println(result.toString());
        }

        sc.close();
    }
}
