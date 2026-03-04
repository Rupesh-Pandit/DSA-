public class PALINDROMIC {

     public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=5-i; j>=1; j--){

                System.out.print(" ");
            }

            for(int k=i; k>=1; k--){
            System.out.print(k);
            // System.out.print(" ");
        }
        for(int k= 2; k<=i; k++){
            System.err.print(k);
            // System.err.print(" ");
        }
         System.err.println();
        }
       
        
     }
}