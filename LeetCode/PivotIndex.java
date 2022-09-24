package LeetCode;

public class PivotIndex {

    public int pivotIndex(int[] nums) {

        int[] rSum = new int[nums.length];
        int[] lSum = new int[nums.length];
        rSum[nums.length-1]= 0 ;
        lSum[0] = 0;

        for(int i = 1;i<nums.length;i++){
            lSum[i] = lSum[i-1] + nums[i-1];
        }
        for(int i = nums.length-2;i>=0;i--){
            rSum[i] = rSum[i+1] +nums[i+1];
        }
        for(int i = 0;i<nums.length;i++)
            if(rSum[i] == lSum[i])
                return i;


        return -1;
    }
    
}
