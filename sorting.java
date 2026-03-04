public class sorting {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is given below:-");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (smallest > arr[j]) {
                    smallest = arr[j];
                }
            }
            arr[i] = smallest;
        }
        System.out.println("Sorted array is given below:-");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println("The sorted in a insertionSort is given");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int[] count = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sort
        int j = 0;
        for (int i = 0; i < largest + 1; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }

        System.out.println("The sorted in a countingSort is given");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
        selectionSort(arr);
        System.out.println();
        insertionSort(arr);
        System.out.println();
        countingSort(arr);
    }
}
