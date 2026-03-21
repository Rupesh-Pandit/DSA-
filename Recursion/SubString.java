import java.util.ArrayList;
import java.util.List;

class SubString {

    public static List<String> subString(String str){
        List<String> list= new ArrayList<>();
        int n= str.length();
        for(int i=0; i<n; i++){
            int count =0; 
            int j=i;

            char ch= str.charAt(i);

            while(j<n){
                if(count==0){
                   String c=String.valueOf(ch);
                    list.add(c);
                    count++;
                   
                }
                else{
                    if(count>0 && str.charAt(j)==ch && j<n){
                        String st= str.substring(i, j+1);
                        list.add(st);
                    }
                }
                 j++;
            }

        }

return list;
       
    }
    public static void main(String [] args){
        String str= "abcab";

        List<String> result = subString(str);
        System.out.println(result);

    }
}