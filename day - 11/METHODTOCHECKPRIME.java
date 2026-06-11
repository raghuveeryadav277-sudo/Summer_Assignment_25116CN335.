public class METHODTOCHECKPRIME {
    public static boolean CheckPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ; i<=n/2 ; i++){
            if(n%i==0 ){
                return false;
            }
        }
            
            return true;
    
}
    public static void main(String[] args){
            int n=9;
            if(CheckPrime(n)){
                System.out.println("Prime Number .");
            }
            else{
                System.out.println("Not A Prime Number .");
            }
        }
    }

