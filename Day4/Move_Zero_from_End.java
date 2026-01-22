package Day4;

public class Move_Zero_from_End {
    public static void moveZeroesToEnd(int[] arr, int n) {
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        int n = array.length;
        moveZeroesToEnd(array, n);
        System.out.println("Array after moving zeroes to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
