//Activity secletion

import java.util.Arrays;
import java.util.Comparator;

public class maxMeeting {
    public static  int maxWork(int st[], int end[]){

        int activities[][]= new int[st.length][3];

        for(int i=0; i< st.length; i++){
            activities[i][0] = i;
            activities[i][1]= st[i];
            activities[i][2]= end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));



        int count =1;

       
        int endTime = activities[0][2];
        System.out.print("A0"+" ");
        for(int i=1;i<st.length; i++){
            if(activities[i][1]>= endTime){
                count++;
                endTime=activities[i][2];
                System.out.print("A"+ i+" ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[]  = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        int result= maxWork(start, end);
        System.out.println(result);
    }
}