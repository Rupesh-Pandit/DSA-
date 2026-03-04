package BitWiseOperator;

public class aNd {
    public static void bit(int n, int i) {
        if ((n & 1 << i) == 0) {
            System.out.println("the bit is 0");
        } else {
            System.out.println("the bit is 1");
        }
        int num = 4;
        System.out.println((num | 1 << 1));
    }

    public static void clearithBit(int num, int i) {
        int a = num & -(1) << i;
        System.out.println(a);
    }
 
    public static void clearRange(int n, int i, int j){
        int bitMask1 = n& (~0)<<i;
        int bitMask2 = n & (2^i-1);
        int c = bitMask1 | bitMask2;
        System.out.println(c);
    } 
    public static void main(String[] args) {
        int a = 10;
        if ((a & 1) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        bit(2, 1);
        clearithBit(10, 2);
        System.out.println("the Clear Range is ");
        clearRange(45,4 ,3);
    }

}
