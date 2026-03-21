import java.util.ArrayList;
import java.util.List;

public class findingIndex {
    public static List<Integer> searchIndex(int arr[], int index, int key, List<Integer> list ){
        if(index== arr.length){
            return list;
        }
        else {
            if(key==arr[index]){
                list.add(index);
            }
            index++;
           return searchIndex(arr, index, key, list);
        }
    }
    public static void main(String [] args){
        int []arr={2,2,4,6,6,3,3,2};
        List<Integer> n= new ArrayList<>();
List<Integer> list = searchIndex(arr, 0, 2, n);
System.out.println(list);

    }
}
