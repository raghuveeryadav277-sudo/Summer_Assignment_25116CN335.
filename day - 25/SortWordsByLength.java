import java.util.Scanner;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of words
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] words = new String[n];

        // Input words
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Sort words by length using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Display sorted words
        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}
