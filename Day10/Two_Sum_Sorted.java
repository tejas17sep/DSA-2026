
package Day10;

import java.util.Arrays;

public class Two_Sum_Sorted {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                // Returning 1-based index as per Two Sum II problem
                return new int[] { i + 1, j + 1 };
            } 
            else if (sum > target) {
                j--;
            } 
            else {
                i++;
            }
        }

        return new int[] {}; // no solution case
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        if (result.length > 0) {
            System.out.println("Target indices: " + Arrays.toString(result));
        } else {
            System.out.println("No valid pair found");
        }
    }
}
