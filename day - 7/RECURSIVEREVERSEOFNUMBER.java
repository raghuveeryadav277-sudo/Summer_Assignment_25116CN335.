public class RECURSIVEREVERSEOFNUMBER {
    static int rev = 0;
    static int reverse(int n){
        if(n==0){
            return rev ;
        }
        rev = rev*10+n%10;
        return reverse(n/10);
    }
    public static void main(String[] args) {
        int num=1234;
        System.out.println("Reverse = " + reverse(num));

    }   
}