package Day3;

public class Check_Array_is_Sorted_or_Not {
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4};
        int n = array.length;
        boolean sorted = isSorted(array, n);
        if (sorted) {
            System.out.println("The array is sorted in non-decreasing order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
