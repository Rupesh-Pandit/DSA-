import java.util.HashMap;
import java.util.Set;

public class iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Rupesh", 200000000);
        hm.put("Bipin", 3000000);
        hm.put("ShreeRam", 100000);

        System.out.println(hm);
        Set<String> keys = hm.keySet();

        // Iteration on hashMap 
        for (String k : keys) { 
            System.out.println("key= "+k+"," +" val= " + hm.get(k));
        }
    }
}
