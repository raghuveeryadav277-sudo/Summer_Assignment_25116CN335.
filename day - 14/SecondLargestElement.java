public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3 , 4, 5, 6, 7};
        int largest = -1;
        int SecondLargestElement=-1 ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>largest)
            {
                largest=arr[i];
            }

        }
    
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>SecondLargestElement && arr[i]!=largest){
                SecondLargestElement=arr[i];
            }

        }
        System.out.println("Second Largest Element is : " + SecondLargestElement);

    }
}
