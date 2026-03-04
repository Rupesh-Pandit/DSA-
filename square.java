public class square {
    public static void main(String args[]){
        int i, j;
        for(i=1; i<=4; i++){
            for(j=3; j>=i; j--){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(i=4; i>=1; i--){
            for(j=4-i; j>=1; j--){
                System.out.print(" ");
            }
            for(j=i; j>=1; j--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
