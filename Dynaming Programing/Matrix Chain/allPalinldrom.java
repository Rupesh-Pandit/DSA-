import java.util.ArrayList;

public class allPalinldrom{
    public static int  len  = Integer.MIN_VALUE;
   public static ArrayList<String> list;


   public static boolean palin(String s, int i, int j){
    if(i> j) return true;

    while(i<j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        else{
            i++;
            j--;
        }
       
    }
    return true;
   }
   public static void rec(String s, int i, int n){
    if(i == n) return ;

    
    for(int j=i; j<n; j++){
        if(palin(s, i, j) == true){
             
            String st = s.substring(i, j+1);
          int l =   st.length();
          len = Math.max(len, l);
            if(!list.contains(st)){
                list.add(st);
            }
             rec(s,j+1, n);
        }

    }
   
   }
    public static void main(String[] args) {
        String s= "aab";

        list  = new ArrayList<>();

        rec(s, 0, s.length());

        System.out.println(list);
        System.out.println(len);
    }
}