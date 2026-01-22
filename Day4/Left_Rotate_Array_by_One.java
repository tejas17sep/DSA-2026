package Day4;

public class Left_Rotate_Array_by_One {
    public static void leftRotateByOne(int[] arr, int n) {
        if (n == 0) {
            return; // No rotation needed for empty array
        }

        int firstElement = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        leftRotateByOne(array, n);
        System.out.println("Array after left rotation by one:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
