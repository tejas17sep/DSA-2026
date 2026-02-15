package Day10;

//https://leetcode.com/problems/container-with-most-water/description/

public class Container_With_Most_Water {

    public static int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1; // ❗ last index
        int ans = 0;

        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, area);

            // move the pointer with smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return ans;
    }

    // main method to run in VS Code
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max Area: " + maxArea(height));
    }
}
