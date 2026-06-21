import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of  matrix1 : ");
        int p = sc.nextInt();
        
         System.out.println("Enter number of columns of  matrix1 : ");
        int q = sc.nextInt();
        int[][] matrix1 = new int[p][q];
        System.out.println("Enter element of matrix 1 : ");
        for(int i=0 ; i< matrix1.length ; i++){
            for(int j=0 ; j<matrix1[i].length ; j++ ){
                matrix1[i][j] = sc.nextInt();
            }
        }

         System.out.println("Enter number of rows of  matrix2 : ");
        int r = sc.nextInt();
        
         System.out.println("Enter number of columns of  matrix2 : ");
        int s = sc.nextInt();
         System.out.println("Enter element of matrix 2 : ");
        int[][] matrix2 = new int[r][s];
         for(int i=0 ; i< matrix2.length ; i++){
            for(int j=0 ; j<matrix2[i].length ; j++ ){
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] matrix3 = new int[p][s];
        if(q==s){
            System.out.println("matrix multiplication is : ");
        }
        else{
            System.out.println("multiplication is not possible . ");
        }
        for(int i=0 ; i<p ; i++ ){
            for(int j=0 ; j<s ; j++){
                matrix3[i][j]=0;
                for(int k =0 ; k<q ; k++){
                    matrix3[i][j] +=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0 ; i< p ; i++){
            for(int j=0 ; j< s ; j++){
                System.out.print(" " + matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
