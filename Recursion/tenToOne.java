public class tenToOne {
    public static void increaseingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            increaseingOrder(n - 1);
        }
    }

    public static void decreasingOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        decreasingOrder(n - 1);
        System.out.print(n + " ");

    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        } else
            return n * factorial(n - 1);
    }
    public static int natural(int n){
        if(n==0){
            return 0;
        } else {
          return  n + natural(n-1);
        }
    }

    public static int fibo(int n){
        if(n<=0) return 0;
        else if(n==1) return 1;
        else return fibo(n-1) + fibo(n-2);
    }

    public static boolean sorted(int arr[], int n){
        if(n==0) return true;
        else if(arr[n-1]<=arr[n]){
                return sorted(arr, n-1);
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,3,4,9,5};
       int  size = arr.length-1;
        int n = 10;
        increaseingOrder(n);
        decreasingOrder(n);
        int n1 = factorial(n);
        System.out.printf("The factorial of %d\t is %d\t", n, n1);

        int sum=natural( 21);
        System.out.println("The sum of n natural number is "+ sum);

        int f= fibo(2);
        System.out.println("The of nth fibonacci series is "+ f);

        boolean t= sorted(arr,size );
        System.out.println("Is this array is sorted " + t);
    }
}