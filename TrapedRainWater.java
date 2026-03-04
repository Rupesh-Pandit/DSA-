public class TrapedRainWater {

    public static int TrapedWater(int height[]){
        //leftMax value
       int  n=height.length;
       int area =0;
        int [] leftMax = new int[n];
        int [] rightMax = new int[n];
         
        leftMax[0]=height[0];
        rightMax[n-1] = height[n-1];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
       // right  max calculation;
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        // finding the water level and area;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(rightMax[i], leftMax[i]);

            area = area + waterLevel -height[i];
        }




        return area;

    }
    public static void main(String[] args) {
        int[] height ={4,2,0,6,3,2,5};
        System.out.println(TrapedWater(height));
        
    }
}
