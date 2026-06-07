import java.util.Scanner;
public class RECURSIVEFIBONACCI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        for(int i=0 ; i<n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: Fibonacci of 0 is 0
        } else if (n == 1) {
            return 1; // Base case: Fibonacci of 1 is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}