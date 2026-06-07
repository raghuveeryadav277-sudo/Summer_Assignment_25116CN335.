import java.util.Scanner;
public class CONVERTDECIMALTOBINARY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();
        int[] binary = new int[50]; 
        int i = 0;
        while (n > 0) {
            binary[i] = n % 2;
            n /= 2;
            i++;
        }
        System.out.print("Binary representation: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }   
    }
}