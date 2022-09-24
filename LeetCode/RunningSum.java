package LeetCode;

public class RunningSum {
    public int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];
        if(nums.length!=0)
            runningSum[0] = nums[0];
        for(int i =1;i<nums.length;i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }

        return runningSum;
    }
}
