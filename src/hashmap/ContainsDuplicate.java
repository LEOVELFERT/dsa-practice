package hashmap;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class ContainsDuplicate {

    public static void main(String[] args) {
        //int[] nums={1,0,1,1};
//        int[] nums={1,2};
        int[] nums={1,4,2,3,1,2};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            int length=nums.length;
            //if length is one return false no chance for duplicates.
            if(length<2){
                return false;
            }
            //counting duplicates count by hashMap
            Map<Integer,Integer> indexMap=new HashMap<>();
            for(int i=0;i<length;i++){
                if(indexMap.containsKey(nums[i])){
                    int previousIndex = indexMap.get(nums[i]);
                    int difference = i - previousIndex; // Calculate difference between indices
                    if (difference <= k) { // Check if the difference is within the allowed range
                        return true; // Found a valid pair
                    }
                }
                indexMap.put(nums[i],i);
            }
            return false;
        }
}
