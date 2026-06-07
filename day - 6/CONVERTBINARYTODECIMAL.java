import java.util.Scanner;
public class CONVERTBINARYTODECIMAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();
        int decimalValue = 0;
        int power = 0;
        while (n > 0) {
            int bit = n % 10;
            decimalValue = decimalValue + bit * (int) Math.pow(2, power);
            n /= 10;
            power++;
        }
        System.out.println("Decimal representation: " + decimalValue);
    }
}

            