import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.println("Enter input in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
