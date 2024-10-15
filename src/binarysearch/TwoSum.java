package binarysearch;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,4,5,6,8,13,16,23,34,45,56,78};
        int target=8;
        int[] ans = twoSum(nums, target);
        System.out.println("the ans is : "+ Arrays.toString(ans));
    }

    public static int[] twoSum(int[] numbers,int target ){
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
