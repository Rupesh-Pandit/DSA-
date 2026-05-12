public class createSTree {
    public static int createST(int arr[], int tree[], int sti, int st, int end) {
        if (st == end) {
            tree[sti] = arr[st];
            return tree[sti];
        }

        int mid = (st + end) / 2;

        createST(arr, tree, 2 * sti + 1, st, mid);
        createST(arr, tree, 2 * sti + 2, mid + 1, end);

        return tree[sti] = tree[2 * sti + 1] + tree[2 * sti + 2];
    }

    // Range of the sum
    public static int getSum(int i, int si, int sj, int qi, int qj, int tree[]) {

        if (qj < si || qi > sj)
            return 0;

        else if (si >= qi && sj <= qj)
            return tree[i];
        else {
            int mid = (si + sj) / 2;
            return getSum(2 * i + 1, si, mid, qi, qj, tree) + getSum(2 * i + 2, mid + 1, sj, qi, qj, tree);
        }

    }

    public static void updateST(int i, int si, int sj, int idx, int diff, int tree[]) {
        if (idx < si || idx > sj)
            return;

        tree[i] += diff;

        if (si != sj) {
            int mid = (si + sj) / 2;

            updateST(2 * i + 1, si, mid, idx, diff, tree);
            updateST(2 * i + 2, mid + 1, sj, idx, diff, tree);
        }

    }

    public static int changeArr(int arr[], int val, int idx) {
        int diff = val - arr[idx];
        arr[idx] = val;
        return diff;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int tree[] = new int[arr.length * 4];

        createST(arr, tree, 0, 0, arr.length - 1);

        for (int k : tree) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println(getSum(0, 0, arr.length - 1, 1, 2, tree));

        int idx =2;
        int diff= changeArr(arr, 02, idx);

        updateST(0, 0, arr.length-1, idx, diff, tree);

        for(int k: tree) System.out.print(k+" ");
    }
}