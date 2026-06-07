import java.util.Scanner ;
public class RECURSIVEFACTORIAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }
}
