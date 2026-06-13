import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array : ");
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("Array : ");
        for(int i=0 ; i<n ; i++){
            sum = sum + arr[i];
            System.out.print(arr[i]);
        }
        System.out.println("Sum of elements are : " + sum);
        int Average ;
        Average=sum/n;
        System.out.println("Average of elements are : "+ Average);
    }
}
