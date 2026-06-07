 import java.util.Scanner;
public class RECURSIVESUMOFDIGIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case: sum of digits of 0 is 0
        }
        return (n % 10) + sumOfDigits(n / 10); // Recursive case
    }
}