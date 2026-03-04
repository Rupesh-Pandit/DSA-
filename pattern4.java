public class pattern4 {
    public static void main(String[] args) {
        int i, j,k;
        for (i=5; i>=1; i--){
            for(j=i; j>1; j--){
                System.out.print(" ");
            }
            for(k=1; k<6; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
