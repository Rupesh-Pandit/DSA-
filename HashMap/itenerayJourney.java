import java.util.HashMap;

public class itenerayJourney {
    public static String findSt(HashMap<String , String> hm){

        HashMap<String , String> m = new HashMap<>();

        for(String key: hm.keySet()){
            m.put(hm.get(key), key);
        }

        for(String key: hm.keySet()){
            if(!m.containsKey(key))
                return key;

        }
        return null;
    }

    public static void main(String []args){
        HashMap<String, String> map = new HashMap<>();
        map.put("Channai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Channai");
        map.put("Delhi", "Goa");

        String start = findSt(map);

        System.out.print(start);
        for(String key: map.keySet()){
            System.out.print("->" + map.get(start));
            start = map.get(start);
        }
        System.out.println();
    }
}