package Day5;

public class Leader_in_Array {
    public static void findLeaders(int[] arr, int n) {
        int maxFromRight = arr[n-1];
        System.out.print(maxFromRight + " "); // The rightmost element is always a leader
        int currentLeader = maxFromRight;
        for (int i =n-2; i>=0; i--){
            if (arr[i] > currentLeader) {
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        int n = array.length;
        System.out.println("Leaders in the array are:");
        findLeaders(array, n);
    }
}