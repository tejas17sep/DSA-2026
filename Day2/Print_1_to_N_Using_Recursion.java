public class Print_1_to_N_Using_Recursion {
    public static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive call
        printNumbers(n - 1);
        // Print the current number after the recursive call
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int N = 5; // You can change this value to print up to any number N
        printNumbers(N);
    }
}
