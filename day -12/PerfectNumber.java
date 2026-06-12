public class PerfectNumber {
    
    public static boolean Perfect(int n){
        int result = 0;
        int original=n;
        int temp=n;
        for(int i=1 ; i<=n-1 ; i++){
            if(temp%i==0){
                result+=i;
            }
        }
        if(result==original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=6;
        boolean result=Perfect(n);
        if(result){
            System.out.println("Perfect Number . ");
        }
        else{
            System.out.println(" Not A Perfect Number .");
        }
    }
}
