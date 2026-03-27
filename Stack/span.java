import java.util.*;

public class span {
    public static void spanfind(int stocks[], int span[]){
        Stack <Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1; i<stocks.length; i++){
            int curStock= stocks[i];
            while(!s.empty()&& curStock>= stocks[s.peek()] ){
                 s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            } else{
                int high= s.peek();
                span[i]= i-high;
            }

            s.push(i);
        }
       
    }
    public static void main(String[] args) {
        int stocks[]= {100,80,60,70,60,85,100};
        int []span=new int[stocks.length];
        spanfind(stocks, span);

        for(int s: span){
            System.out.println(s);
        }
    }
}
