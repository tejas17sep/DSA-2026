package Day5;

public class Frequency_in_Sorted_Array {
    public static void printFrequencies(int[] arr, int n) {
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " occurs " + count + " times");
                count = 1;
            }
        }
        // Print the frequency of the last element
        System.out.println(arr[n - 1] + " occurs " + count + " times");
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int n = array.length;
        printFrequencies(array, n);
    }
}
