import java.util.Arrays;

public class DuplicateRemoving {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 5, 5 };

        int n = nums.length;
        int a = n;

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (nums[i] == nums[j]) {
                    a--;
                    for (int k = j; k < a; k++) {
                        nums[k] = nums[k + 1];
                    }
                    j--;
                }
            }
        }

        // fill remaining with 0
        for (int i = a; i < n; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("The length of array is " + a);
    }
}