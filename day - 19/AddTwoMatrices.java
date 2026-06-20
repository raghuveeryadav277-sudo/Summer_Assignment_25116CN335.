import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows of matrix first : ");
        int p = sc.nextInt();
         System.out.print("Enter number of column of matrix first : ");
        int q= sc.nextInt();
         System.out.print("Enter number of rows of matrix second : ");
        int r = sc.nextInt();
         System.out.print("Enter number of column of matrix second: ");
        int s = sc.nextInt();
        int[][] matrix1 = new int[p][q];
        System.out.println("Enter element of matrix first : ");
        for(int i=0 ; i<p ; i++){
            for(int j=0 ; j<q ; j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
         int[][] matrix2 = new int[r][s];
        System.out.println("Enter element of matrix second : ");
        for(int i=0 ; i<p ; i++){
            for(int j=0 ; j<q ; j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        int[][] Summatrix =new int[p][q];
        if(p==q ){
            if(r==s){
                for(int i=0 ; i<p ; i++){
                    for(int j=0 ; j<q ; j++){
                         Summatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                    } 
                }
               
            }
            else{
                System.out.println("SUM IS not possible . ");
            }
        
        }
         else{
                System.out.println("SUM IS not possible . ");
            }
              System.out.println("SUM matrix is : ");
              for(int i=0 ; i<p ; i++){
                for(int j=0 ; j<q ; j++){
                    System.out.print(Summatrix[i][j]+"  ");
                }
                System.out.println();
              }

    }
}
