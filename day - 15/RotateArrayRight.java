public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {2 ,4 , 5 , 6 , 7 , 8};
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1 ; i>0  ; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        n=arr.length;
        System.out.println("Rotated Array : ");
        for(int i=0 ; i< n ; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
