public class fastExponent {

    public static int pow(int base, int power){
        int a;
        if(power ==0) return 1;
        else a=pow(base, power/2) * pow(base, power/2);

        if(power%2!=0) {
            a= a*base;
        }
        return a;
    }
    public static void main(String[] args) {
        int base =3;
        int power = 2;

        int ans=1;
        while(power!=0){
            if((power & 1) ==1){
                ans = ans*base;
                base*=base;
                power = power>>1;

            } else {
               base*=base;
               power = power>>1;
            }
        }

        System.out.println(ans);

       int c= pow(3,2);
       System.out.println(c);
    }
}
