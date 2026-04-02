import java.util.Arrays;
import java.util.Comparator;

public class kanpSack {
    public static void main(String [] args){
        int weight[]= {10, 20, 30}; 
        int value[] = {60, 100, 120};
        double totalVal= 0;

        int W= 50;
        double ratio[][]= new double[weight.length][2];


        for(int i=0; i< value.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= value[i]/weight[i];
        }

        int capacity = W;
        // Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for(int i=ratio.length-1; i>=0; i--){
            int idx=(int) ratio[i][0];

            if(capacity>=weight[idx]){
                capacity-= weight[idx];
                totalVal+= value[idx];
            } else{
                totalVal += (ratio[i][1]*capacity);
                break;
            }
        }
        System.out.println("total maximum value is "+ totalVal);
    }
}
