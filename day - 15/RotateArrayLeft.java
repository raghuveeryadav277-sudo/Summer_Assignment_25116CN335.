public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {2 ,4 , 5 , 6 , 7 , 8};
        int n = arr.length;
        int temp = arr[0];
        for(int i=0 ; i<n-1  ; i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        n=arr.length;
        System.out.println("Rotated Array : ");
        for(int i=0 ; i< n ; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
