import java.util.Scanner;

public class DecimalToBinary {
    public static int BToD( int num ){
        int i=0, sum=0;
        while(num!=0){
            int r= num%10;
            num = num/10;
            sum = sum +(int) Math.pow(2, i) * r;
            i++;

        }
        return sum;
    }

    public static int DToB(int num){
          int sum = 0;
        int i=1;

        while(num!=0){
            int r= num%2;
            sum = sum + r*i;
            num =num/2;
            i =i* 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter decimal number");
        int num = sc.nextInt();
        System.out.println("Enter Binary number");
        int num1= sc.nextInt();

        int sum = DToB(num);
        System.out.println("Your binaray number is " + sum);
        
        int b= BToD(num1);
        System.out.println("Your decimal number is " + b);
    }
}
