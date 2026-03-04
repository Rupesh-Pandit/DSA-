import java.util.Scanner;

public class Array {
    public static void display(int arr[]){
System.out.println("Your subjects marks");
        for(int i=0; i<3; i++){
            System.out.print(arr[i]+ "\t");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Enter your marks of  physics chemistry and math");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
              arr[i] = sc.nextInt();
        }
        display(arr);

        System.out.println("Please enter Upadate the number and data to instered");
        int a= sc.nextInt();
        int data = sc.nextInt();
        arr[a-1] = data;
        display(arr);

        

    }
}
