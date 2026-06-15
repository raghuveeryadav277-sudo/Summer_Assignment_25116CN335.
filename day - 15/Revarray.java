public class Revarray {
    public static void main(String[] args) {
        int[] arr = {2 , 4 , 3 , 5 , 9};
        int n=arr.length;
        int[] revArray =  new int[n];
        for(int i=0 , j=n-1 ; i<n ; i++,j--){
            revArray[i]=arr[j];
        }
        System.out.println("Reverse Array : ");
        for(int i=0 ;i<n ; i++){
            System.out.print(" "+revArray[i]);
        }
     }
}
