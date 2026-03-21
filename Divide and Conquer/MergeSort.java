public class MergeSort {

    public static void merg(int arr[], int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = 0;
        int[] a = new int[r - l + 1];      

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                a[k] = arr[i];
                k++;
                i++;
            } else {
                a[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= m) {
            a[k] = arr[i];
            k++;
            i++;
        }
        while (j <= r) {
            a[k] = arr[j];
            k++;
            j++;
        }
        for (int o = 0; o < a.length; o++) {
            arr[l + o] = a[o];
        }
    }

    public static void merg_sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            merg_sort(arr, l, m);
            merg_sort(arr, m + 1, r);
            merg(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 1, 6, 4 };
        merg_sort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
