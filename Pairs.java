public class Pairs {
    public static void main(String[] args) {
        int [] arr= {23, 43, 12, 78};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.err.printf("(%d,%d)\t", arr[i], arr[j]);
            }
        }
    }
}
