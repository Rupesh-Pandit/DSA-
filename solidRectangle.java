public class solidRectangle {
    public static void main(String[] args) {
        int i, j;
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.err.print("\n");
        // }

        for ( i = 1; i <= 4; i++) {
            for ( j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.print("\n");
        }
    }

}
