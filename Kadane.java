import java.util.Arrays;

public class Kadane {
    public static void main(String[] args) {
        int cs = 0, ms = Integer.MIN_VALUE;
        int[] numbers = { -2, -3, -4, 1, -2, -1,-5, -3 };
        for (int i = 0; i < numbers.length; i++) {
             cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            } 
           ms = Math.max(ms, cs);
        }
        if(ms==0){
            Arrays.sort(numbers);
            ms=numbers[0];
        }
        System.out.println(ms);
    }
}
