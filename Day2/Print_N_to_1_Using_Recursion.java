public class Print_N_to_1_Using_Recursion {

    public static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Print the current number before the recursive call
        System.out.print(n + " ");
        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int N = 5; // You can change this value to print down from any number N
        printNumbers(N);
    }
} 