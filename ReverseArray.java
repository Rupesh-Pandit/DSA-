public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {23, 43, 12, 78};

        System.out.println("Before the array reverse");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "\t");

        for(int i=0; i<arr.length/2; i++){
            int a=arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-i-1] = a;
        }

        System.out.println("After the array reverse");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "\t");
    }
}
