public class MAXOFTWO {
    public static int Max(int a , int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        int a=30;
        int b=29;
        int maximum = Max(a , b);
        System.out.println("Maximum of two : " + maximum);
    }
}
