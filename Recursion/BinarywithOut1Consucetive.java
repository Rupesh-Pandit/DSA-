public class BinarywithOut1Consucetive {
    public static void Binary(int n, int lastDigit, String str2){
        if(n==0){
            System.out.println(str2.toString());

            return;
        } else if(lastDigit== 0){
            Binary(n-1, lastDigit=0, str2+0);
            Binary(n-1, lastDigit=1, str2+1);
        } else{
            Binary(n-1, lastDigit=1, str2+0);
        }
    }
    public static void main(String[] args) {
        Binary(4, 0,"");
    }
}
