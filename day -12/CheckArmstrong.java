public class CheckArmstrong {
    public static boolean Armstrong(int n){
        int temp = n ;
        int digit = 0;
        while(temp>0){
            digit ++;
            temp=temp/10;
        }
        temp=n;
        int result=0;
        while(temp>0){
            int rem=temp%10;
            result=result + (int)Math.pow(rem , digit);
            temp=temp/10;
        }
        if(result==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n=152;
        boolean result=Armstrong(n);
        if(result){
            System.out.println("Armstrong Number ");
        }
        else{
            System.out.println("Not a Armstrong Number ");
        }
    }
}
