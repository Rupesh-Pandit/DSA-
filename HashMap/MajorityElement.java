import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3, 1 };
        int n = (arr.length) / 3;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        Set<Integer> keySet = hm.keySet();
        for (Integer key : keySet) {
            if (hm.get(key) > n) {
                System.out.println(key);
            }
        }
    }

}