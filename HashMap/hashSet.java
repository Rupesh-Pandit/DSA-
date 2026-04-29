import java.util.*;
public class hashSet{
    public static void main(String []args){
       HashSet<Integer>set = new HashSet<>();
       set.add(1);
       set.add(3);
       set.add(7);
       set.add(3);
       set.add(8);
       set.add(9);
       set.add(null);
       set.remove(1);

    //    set.clear();
       System.out.println(set.isEmpty());
       System.out.println(set.contains(3));


       // Iterator in hashSet 

    //    Iterator it = set.iterator();
    //    while(it.hasNext()){
    //     System.out.println(it.next());
    //    }

    for(Integer num: set){
        System.out.println(num);
    }
       System.out.println(set);


       System.out.println();

       HashSet<String> hs = new HashSet<>();
       hs.add("Kathmandu");
       hs.add("Dhangadha");
       hs.add("Barathawa");
       // LinlkedHashSet always in non duplicating parameter or data
       LinkedHashSet<String> lhs =new LinkedHashSet<>();
       lhs.add("Kathmandu");
       lhs.add("Dhangadha");
       lhs.add("Barathawa");

       for(String city : lhs){
        System.out.println(city);
       }
       System.out.println();

       // TreeSet always comes in sorted form 
       TreeSet<String> ths = new TreeSet<>();
       ths.add("Kathmandu");
       ths.add("Dhangadha");
       ths.add("Barathawa");

       for(String city: ths)
        System.out.println(city);

       System.out.println(hs); 
       System.out.println(lhs);
       System.out.println(ths);
       
    }
}