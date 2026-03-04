public class HollowPattern {
    public static void Hollow_rectangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 - i; j >= 1; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void FloydTriangle() {
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                a++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void ZeroOneTriangle() {
        int a = 1;
        System.out.print("This is the 0-1 Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a % 2 + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void ButterflyPattern() {
        int a = 0;
        int k = 6;
        System.out.println();
        System.out.println("This is a butterfly pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 6 - a; j > 0; j--)
                System.out.print(" ");
            a = a + 2;
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = i; j >= 1; j--)
                System.out.print("*");
            for (int j = 6 - k; j > 0; j--)
                System.out.print(" ");
            k = k - 2;
            for (int j = i; j >= 1; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void Hollow_Rhombus() {

        System.out.println("This is the hollow Rhombus");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < (5-i); j++)
                System.out.print(" ");
            for (int k = 1; k <= 5; k++) {
                if (k == 1 || i == 1 || k== 5 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_rectangle();
        invertedHalfPyramid();
        FloydTriangle();
        ZeroOneTriangle();
        ButterflyPattern();
        Hollow_Rhombus();
    }
}
