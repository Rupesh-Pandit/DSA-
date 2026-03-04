import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int Binary(int arr[], int start, int end, int data) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == data) {
                return 1;
            } else if (arr[mid] < data) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 4, 34, 54, 51, 1, 0 };
        System.out.println("Enter data you want to search");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int flag;

        int end = arr.length - 1;
        int start = 0;
        Arrays.sort(arr);

        flag = Binary(arr, start, end, data);

        if (flag == 1) {
            System.out.println("Data is found");
        } else {
            System.out.println("Data is not found");
        }
    }
}
