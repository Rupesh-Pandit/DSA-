import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

class TilingProblem{

    public static int tiling(int n){
       if(n==0|| n==1){
        return 1;
       }

       //vertical tiling;
       int vt= tiling(n-1);

       //Horizontal tiling
       int ht = tiling(n-2);

       return ht+vt;
    }
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number or 2* n tiling");
       int  n = sc.nextInt();

       int a=tiling(n);
       System.out.println(a);


    }
}