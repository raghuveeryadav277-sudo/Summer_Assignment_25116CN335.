public class CheckEvenOdd {
    public static void main(String[] args) {
        int[] arr ={2 , 4 ,3 , 5 , 6 , 7 , 8, 9 };
        int evenCount = 0;
        int oddCount = 0;
        for(int i= 0 ; i<arr.length ; i++){
            if(arr[i]%2==0 ){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println(" Total Even Elements are : "+ evenCount);
        System.out.println("Total odd Elements are : "+ oddCount);
    }
}
