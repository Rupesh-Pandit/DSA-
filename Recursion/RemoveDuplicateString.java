import java.util.Arrays;

public class RemoveDuplicateString {

   public static void  withRecursive(String str, int index, StringBuilder sb,boolean check[]){
        if(index==str.length()){
        // System.out.println(sb.toString());
        
        String s= sb.toString();
        char [] ch= s.toCharArray();
        Arrays.sort(ch);
    
        System.out.println(new String(ch));
        return;
         
        } else {
            int ci =str.charAt(index)-'a';
            char ch=str.charAt(index);
            if(check[ci]!=true){
                     sb.append(ch);
                     check[ci]= true;
            }
            index++;
            withRecursive(str, index, sb, check);
        }
    }


    public static void main(String [] args){
        String str= "aapancollege";
        StringBuilder sb= new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            int k=i-1;
            int n=0;
            while (k>=0) {
                if(str.charAt(k)==ch)
                n++;
            k--;
            }
            if(n==0)
                sb.append(ch);

        }

        boolean [] check= new boolean[26];
StringBuilder s= new StringBuilder("");
        withRecursive("cbacdcbc", 0, s,check);
        System.out.println(sb.toString());

    }
}
