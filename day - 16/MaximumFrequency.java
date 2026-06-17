public class MaximumFrequency {
    public static void main(String[] args) {
        int[] arr = { 2 , 4 ,3 ,2  , 4 , 5 ,6 , 2 ,7};
        int MaxFrequency =0;
        int element =0;
        for(int i=0; i<arr.length ; i++){
            int count =1;
            for(int j=1+i; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            if(count > MaxFrequency){
                MaxFrequency=count;
                element=arr[i];
            }
        }
        System.out.println("Element = " + element );
        System.out.println("Frequency = "+ MaxFrequency);
    }
}
