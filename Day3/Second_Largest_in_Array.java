package Day3;

public class Second_Largest_in_Array {
    public static int findSecondLargest(int[] arr, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int firstLargest = 0;
        int secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[firstLargest]) {
                secondLargest = firstLargest;
                firstLargest = i;
            }

            else if (arr[i] != arr[firstLargest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {5, 5, 4, 3};
        int n = array.length;
        int secondLargest = findSecondLargest(array, n);
        System.out.println("The second largest element in the array is: " + array[secondLargest]);
    }
}
