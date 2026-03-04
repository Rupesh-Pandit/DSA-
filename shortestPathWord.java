public class shortestPathWord {
    
    
    public static void main(String[] args) {
        String str= "EWNSEESNN";
       float x=0;
       float y=0;
        for(int i=0; i<str.length(); i++)
           if(str.charAt(i)=='E'){
            x++;
           }
           else if(str.charAt(i)=='W'){
            x--;
           }
           else if(str.charAt(i)=='N'){
            y++;
           }
           else if(str.charAt(i)=='s'){
            y--;
           }
           float a = x*x + y*y;
float displacement =(float) Math.sqrt(a);
System.out.println(displacement);
    }
}