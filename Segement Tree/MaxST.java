public class MaxST {
    public static int buildTree(int tree[], int st, int end, int sti, int arr[]) {
        if (st == end) {
            tree[sti] = arr[st];
            return tree[sti];
        } else {
            int mid = (st + end) / 2;
            int left = buildTree(tree, st, mid, 2 * sti + 1, arr);
            int right = buildTree(tree, mid + 1, end, 2 * sti + 2, arr);
            tree[sti] = Math.max(left, right);

        }
        return tree[sti];
    }

    public static int getMax(int ar[], int tree[], int qi, int qj, int sti, int stj, int i) {
        if (qj < sti || qi > stj)
            return Integer.MIN_VALUE;

        else if (sti <= qi && stj >= qj)
            return tree[i];

        int mid = (sti + stj) / 2;
        int left = getMax(ar, tree, qi, qj, sti, mid, 2 * i + 1);
        int right = getMax(ar, tree, qi, qj, mid + 1, stj, 2 * i + 2);
        return Math.max(right, left);

    }

    public static void update(int arr[], int tree[], int sti, int i, int j, int idx, int val) {
        if (idx < i || idx > j)
            return;
        tree[sti] = Math.max(tree[sti], val);
        if (i != j) {
            int mid = (i + j) / 2;
            update(arr, tree, 2 * sti + 1, i, mid , idx, val);
            update(arr, tree, 2 * sti + 2, mid + 1, j, idx, val);
        }
    }

    public static void main(String[] str) {
        int arr[] = { 1, 2, 3, 7, -2, 3, 0 };

        int tree[] = new int[arr.length * 4];

        buildTree(tree, 0, arr.length - 1, 0, arr);
        for (int k : tree)
            System.out.print(k + " ");

        int d = getMax(arr, tree, 0, 5, 0, arr.length - 1, 0);
        System.out.println();
        System.out.println(d);
        update(arr, tree, 0, 0, arr.length - 1, 2, 20);

        System.out.println(getMax(arr, tree, 0, 5, 0, arr.length - 1, 0));
    }
}
