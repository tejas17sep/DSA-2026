package Day4;

public class Left_Rotate_Array_by_N {
    public static void leftRotateByN(int[] arr, int n, int d) {
        if (n == 0) {
            return; // No rotation needed for empty array
        }

        d = d % n; // In case d is greater than n
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int d = 2; // Number of positions to rotate
        leftRotateByN(array, n, d);
        System.out.println("Array after left rotation by " + d + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
