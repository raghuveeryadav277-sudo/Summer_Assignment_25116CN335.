public class MissingNumber {
    public static void main(String[] args) {
        int totalSum=0;
        int[] arr={1 ,2 ,3 , 4 ,5 , 7  , 8};
        int n=8;
        int expectedSum = (n*(n+1))/2 ;
        for(int i = 0 ; i<n-1 ; i++){
            totalSum +=arr[i];
        }
        int MissingNumber = expectedSum - totalSum ;
        System.out.println(MissingNumber);
    }
}