package blindly75;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {
    public int maxSubArray(final int[] nums) {
        int currentSum=nums[0];
        int maxSum= nums[0];

        for(int i=1;i<nums.length;i++){
            currentSum = currentSum+nums[i];
            if(currentSum<nums[i]){
                currentSum=nums[i];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        return maxSum;
    }

    public int[] maximumSubArray(final int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        int currentStartIndex = 0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;

        for (int i = 1; i < nums.length; i++) {

            // Decide whether to continue or start fresh
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
                currentStartIndex = i;
            } else {
                currentSum += nums[i];
            }

            // Remember the best subarray found so far
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxStartIndex = currentStartIndex;
                maxEndIndex = i;
            }
        }

        // Extract the maximum-sum subarray
        int length = maxEndIndex - maxStartIndex + 1;
        int[] result = new int[length];

        System.arraycopy(
                nums,
                maxStartIndex,
                result,
                0,
                length
        );

        return result;
    }

    public static void main(String[] args) {
        final MaxSubArray maxSubArray=new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(new int[]{-1,2,-3,6}));
        System.out.println(Arrays.toString(maxSubArray.maximumSubArray(new int[]{-1,2,-3,6})));
    }
}
