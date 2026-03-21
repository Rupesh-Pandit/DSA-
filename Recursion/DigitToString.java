import java.util.*;
public class DigitToString {
    public static List<String> Stringconveter(int arr[], int idx, String digit[], List<String> str){
        if(idx==arr.length){
            return str;
        }

        else {
            int d=arr[idx];
            String ch= digit[d];
            str.add(ch);
            return Stringconveter(arr, idx+1, digit, str);
        }
    }
    public static void main(String[] args) {
        List<String> str= new ArrayList<>();
        int []arr= {1,2,3,5};
        String []digit ={"Zero","one", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine"}; 

        List<String> result = Stringconveter(arr, 0, digit,str);
        System.out.println(result);
        
    }
}
