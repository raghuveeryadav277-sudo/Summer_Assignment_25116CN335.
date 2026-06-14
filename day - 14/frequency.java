public class frequency {
    public static void main(String[] args) {
        int[]  arr = { 2 , 3, 4, 5, 6 , 2, 8 } ;
        int count =0;
        int target=2;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(target + " repeat " + count + " times ");
    }
}
