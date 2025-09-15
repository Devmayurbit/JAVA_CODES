import java.util.*;
public class mainn {
        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            
            // Calling the twoSum method with the 'nums' array and 'target' value
            int[] indices = solution.twoSum(nums, target);
            
            if (indices.length == 2) {
                System.out.println("Indices: " + indices[0] + ", " + indices[1]);
            } else {
                System.out.println("No two sum solution found.");
            }
        }
    }
    

