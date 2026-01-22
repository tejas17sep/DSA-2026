package Day4;

public class Remove_Dublicate_from_Sorted_Array {

    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        int newLength = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }
        return newLength;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = array.length;
        int newLength = removeDuplicates(array, n);
        System.out.println("The array after removing duplicates is:");
       for (int i = 0; i < newLength; i++) {
        
        System.out.print(array[i] + " ");
        }
    }    
}