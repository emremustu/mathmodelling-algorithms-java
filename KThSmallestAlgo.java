public class KThSmallestAlgo {
    
    public static int kthSmallest(int[] nums,int k){
        int greater_count =0;
        int j = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i]>nums[j]){
                greater_count++;
            }
            if(j==nums.length-1){
                if(greater_count==nums.length-1-k){
                    break;
                }
                else{
                    i++;
                    j=0;

                    greater_count=0;
                }
            }

            
            

            

            j++;
            
        }
        return nums[i];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        
        System.out.println(kthSmallest(nums, 2));
    }


}
