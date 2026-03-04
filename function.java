import java.util.*;
public class function {
    public static void myName(String name){
System.out.print(name);
return;
    }
    public static int Add(int a, int b){
        return a+b;
    }
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    String name = sc.nextLine();
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= Add(a,b);
    System.out.print(c);
    myName(name);
}
    
} 