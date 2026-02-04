package Day5;

public class Max_Diff_in_Array_Elements {
    public static int maxDifference(int[] arr, int n) {
        if (n < 2) {
            return 0; // Not enough elements to find a difference
        }
        int maxDiff = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]-arr[j]>maxDiff) {
                    maxDiff = arr[i]-arr[j];
                }
            }
            
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 10, 6, 4, 8, 1};
        int n = array.length;
        int result = maxDifference(array, n);
        System.out.println("The maximum difference is: " + result);
    }
}
