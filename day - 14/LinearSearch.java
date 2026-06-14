public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3 , 4 , 5 , 6 , 1 , 9 , 8};
        int targetnumber=1;
        int i ;
        for(i=0;  i<arr.length ; i++){
            if(arr[i]==targetnumber){
                break;
            }
        }
        System.out.println("Target number is found at index " + i);
    }
}
