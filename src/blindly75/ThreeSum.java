package blindly75;
//https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        //lines of code
        ThreeSum threeSum=new ThreeSum();
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-2, 0, 0, 2, 2});
        System.out.println(lists);
    }


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        //nums = [-2, 0, 0, 2, 2];
        for (int i = 0; i < nums.length - 2; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {   //skip duplicate values of the left
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {      //skip duplicate values of the right
                        right--;
                    }
                } else if (sum < 0) {
                    left++;  //sorted arry defineitely next value will be higher than previos value else equal
                } else {
                    right--;
                }
            }
        }
        return list;
    }
}
