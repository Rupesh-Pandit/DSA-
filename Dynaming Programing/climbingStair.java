import java.util.Arrays;

public class climbingStair {

    public static int ways(int n, int wage[]){

      if(n<0) return 0;
      if(n==1)  return 1;

      if(wage[n] !=-1) return wage[n];

      wage[n] = ways(n-1, wage) + ways(n-2, wage);
      return wage[n];

    }
    public static void main(String[] args) {
        int n = 5;

        int wage[]  = new int[n+1];
        Arrays.fill(wage, -1);

       System.out.println(ways(n, wage));
    }
}
