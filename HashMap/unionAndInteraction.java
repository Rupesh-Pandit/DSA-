import java.util.ArrayList;
import java.util.HashSet;

public class unionAndInteraction {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int arr[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!hs.contains(arr2[i])) {
                hs.add(arr2[i]);
            }
        }
        for(int i=0; i<arr2.length; i++)
            hs2.add(arr2[i]);

        for(int i = 0; i<arr.length; i++){
            if(hs2.contains(arr[i])){
                al.add(arr[i]);
            }
        }

        System.out.println("The intersection of the two array is " + al);
        System.out.println("The union of two array is "+ hs );

    }
}
