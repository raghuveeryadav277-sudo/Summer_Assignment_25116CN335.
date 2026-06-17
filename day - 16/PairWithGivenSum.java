public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2 , 3 , 5 , 6, 7 ,8 , 1 };
        
        int sum = 8;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=1+i ; j<arr.length ; j++){
                if(arr[i]+arr[j]==sum){
                     System.out.println("the pair are : " + arr[i] + " and " + arr[j]);
                }
            }
        }
           
    }
}
