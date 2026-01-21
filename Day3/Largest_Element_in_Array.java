package Day3;

public class Largest_Element_in_Array {
    public static int findLargest(int[] arr, int n) {
        // Base case: if the array has only one element
        if (n == 1) {
            return arr[0];
        }
        
        int max=arr[0];
        for (int i = 1; i < n; i++) {
        if (max<arr[i]) {
            max=arr[i];
        }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4};
        int n = array.length;
        int largest = findLargest(array, n);
        System.out.println("The largest element in the array is: " + largest);
    }
}
