public class CheckPalindrome {
    
    public static boolean Palindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n=123;
        boolean result=Palindrome(n);
        if(result){
            System.out.println("The number is Palindrome ");
        }
        else{
            System.out.println("The number is not a Palindrome ");
        }
    }
}
