package BitWiseOperator;

public class fastExponent {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int ans=1;

        while (b>0) {
            if((b&1)!=0){
                ans=ans*a;
                a=a*a;
            } else{
                a=a*a;
            }
            b>>=1;
        }
        System.out.println(ans);
    }
    
}
