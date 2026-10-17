package blindly75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    static int[] getTwoSum(int array[],int target){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<array.length;i++){
            int complement=target-array[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(array[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] twoSum = getTwoSum(new int[]{2, 3, 4, 5}, 5);
        System.out.println(Arrays.toString(twoSum));
    }
}
