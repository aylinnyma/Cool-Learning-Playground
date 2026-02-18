import java.util.HashMap;

public class MyProgram{
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum; // reuse previous computation
        }
        return b;
    }

    public static int fibonacciMemo(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        if (memo.containsKey(n)) return memo.get(n); // Return stored value

        int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        memo.put(n, result); // Store result for future calls

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.err.println(factorial(i)); // 1, 1, 2, 6, 24
        for (int i = 0; i < 5; i++)
            System.err.println(fibonacci(i)); // 0, 1, 1, 2, 3
        System.err.println(fibonacciIterative(6));
        System.out.println("Fibonacci with Memoization: " + fibonacciMemo(10));
    }
}