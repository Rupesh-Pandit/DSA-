public class InvertedHalfPyramit180deg {
    public static void main(String[] args) {
        int i, j;
        for(i=1; i<=4; i++){
            //inner loop for space display
            for(j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
