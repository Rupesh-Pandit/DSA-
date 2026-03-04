public class buterflyPattern {

    public static void main(String args[]) {
        int i, j;
        int a = 6;
        int b = 0;

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = a; j >= 0; j--) {
                System.out.print(" ");

            }
            a = a - 2;
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = 4; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (j = b; j >= 0; j--) {
                System.out.print(" ");
            }
            b = b + 2;
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}