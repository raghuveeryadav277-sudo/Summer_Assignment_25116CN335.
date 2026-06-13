public class SmallestAndLargestElement {
    public static void main(String[] args) {
        int[] arr ={3 , 4 , 5 , 7 ,8 , 9};
        int smallestElement = arr[0];
        int largestElement = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<smallestElement){
                smallestElement = arr[i];
              
                 }
              if(arr[i]>largestElement){
                    largestElement = arr[i];
                }
         }
         System.out.println("Smallest Element is : "+ smallestElement);
         System.out.println("Largest Element is : "+ largestElement);
    }
}
