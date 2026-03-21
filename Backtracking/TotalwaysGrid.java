public class TotalwaysGrid {
public static int totalGrid(int i, int j, int m, int n){
    if(i==m-1&& j==n-1)
        return 1;

    if(i==m || j==n) 
        return 0;

    return totalGrid(i+1, j, m, n) + totalGrid(i, j+1, m, n);
}
    public static void main(String [] args){
        int m=3, n=2;
        int total = totalGrid(0, 0, m, n);
        System.out.println(total);
    }
}