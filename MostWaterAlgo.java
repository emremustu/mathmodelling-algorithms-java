public class MostWaterAlgo {


    public static int mostWater(int[] height){
        int i =0;
        int j=1;
        int area=0;
        while(i<height.length-j){
            
    
    
    
            int distance = (height.length-j)-i;
            int columnHeight= Math.min(height[i], height[height.length-j]);
            if(distance*columnHeight>area)area=distance*columnHeight;
    
            j++;
    
            if(i==height.length-j){
                j=1;
                i++;
            }
        }    
        return area;
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }

}
