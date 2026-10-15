package blindly75;
import java.util.Map;
import java.util.HashMap;

//https://leetcode.com/problems/contains-duplicate/

public class ContainsKey {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length<1){
            throw new RuntimeException("Array Can't be empty");
        }
        final Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    public static void main(String[] args){
        ContainsKey containsKey=new ContainsKey();
        System.out.println(containsKey.containsDuplicate(new int[]{-1,2,-3,6}));
    }
}
