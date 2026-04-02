import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minimumNote {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
         Integer []notes= {1,2,5,10, 20, 50,200, 100, 500, 2000};

         int amount= 2076;
         int count=0;
         Arrays.sort(notes, Collections.reverseOrder());
         for(int i=0; i<notes.length; i++){
            if(amount>=notes[i]){
                while (amount>=notes[i]) {
                    count++;
                    arr.add(notes[i]);
                    amount-=notes[i];
                }
            }
         }


         System.out.println(arr.toString());
         System.out.println(count);


         
    }
}
