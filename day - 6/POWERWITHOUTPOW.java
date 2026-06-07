import java.util.Scanner;
public class POWERWITHOUTPOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
