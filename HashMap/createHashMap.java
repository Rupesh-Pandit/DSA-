import java.util.*;

public class createHashMap {
    public static void main(String []args ){
        HashMap<String, Integer> hm = new HashMap<>();
        // put O(1)
        hm.put("Rupesh", 200000000);

        hm.put("Bipin", 3000000);
        hm.put("ShreeRam", 100000);

        System.out.println(hm);

        // get O(1);
        System.out.println(hm.get("Rupesh"));

        // ContainsKey - O(1)
           System.out.println(hm.containsKey("Rupesh")); // true
           System.out.println(hm.containsKey("Pandit")); // false

           System.out.println(hm.remove("ShreeRam"));
           System.out.println(hm);

           // size of hash map
           System.out.println(hm.size());

           // clear function 
           hm.clear();


           // check the hash map empty 
           System.out.println(hm.isEmpty());
    }
}
