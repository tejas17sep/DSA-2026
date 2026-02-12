package Day9;

class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                ans = nums[i];
            }

            if (nums[i] == ans) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }
}

public class Majority_Element {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        System.out.println("The majority element is: " + result);
    }
}
