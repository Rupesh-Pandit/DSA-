import java.util.*;
import java.util.Collections;

public class minCutPriceSquare {

    public static void main(String[] args) {
        Integer horizontal[] = { 4, 1, 2 };
        Integer vertical[] = { 2, 1, 3, 1, 4 };

        Arrays.sort(horizontal, Collections.reverseOrder());
        Arrays.sort(vertical, Collections.reverseOrder());

        int h = 0, v = 0;
        int vp = 1, hp = 1;
        int cost = 0;

        while (h < horizontal.length && v < vertical.length) {
            if (horizontal[h] <= vertical[v]) { // vertical cut
                cost += (hp * vertical[v]);
                vp++;
                v++;
            } else { // horizontal cut
                cost += (vp * horizontal[h]);
                hp++;
                h++;
            }
        }

        while (v < vertical.length) {
            cost += hp * vertical[v];
            vp++;
            v++;
        }
        while (h < horizontal.length) {
            cost += (vp * horizontal[h]);
            h++;
            hp++;
        }

        System.out.println("Total minimum cut cost is " + cost);
    }
}