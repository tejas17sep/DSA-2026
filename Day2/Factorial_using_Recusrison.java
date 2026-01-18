public class Factorial_using_Recusrison {
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int N = 5; // You can change this value to compute factorial of any number N
        int result = factorial(N);
        System.out.println("Factorial of " + N + " is: " + result);
    }
}
