package Day12;
public class RemoveDuplicates {
    
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return new int[0];
        
        int uniqueCount = 1; // At least one unique element exists
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }
        
        int[] uniqueArr = new int[uniqueCount];
        uniqueArr[0] = arr[0];
        int index = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArr[index++] = arr[i];
            }
        }
        
        return uniqueArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = removeDuplicates(arr);
        
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
