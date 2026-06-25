import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                sc.close();
                return;
            }
        }

        System.out.println("No non-repeating character found.");

        sc.close();
    }
}