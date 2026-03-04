import java.util.Scanner;

public class swap {
    public static void Swap(int a, int b){
         a=a+b;
         b = a-b;
         a=a-b;
         System.out.print(a);
         System.out.println(b);

    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        Swap(a,b);


    }
}
