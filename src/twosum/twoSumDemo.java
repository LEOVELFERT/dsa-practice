package twosum;

import java.util.HashMap;
import java.util.Map;

public class twoSumDemo {
    public static void main(String[] args) {
        int[] nummbersArray={2,3,4,5,7,8};
        //target=7
        //output 0,3
        int target=7;
        int[] targetArray=new int[2];
         targetArray=getTargetArray(nummbersArray,target);
        if(targetArray.length>0){
            System.out.println(targetArray[0]+","+targetArray[1]);
        }
    }

    private static int[] getTargetArray(int[] numbersArray, int target) {
        Map<Integer, Integer> targetMap = new HashMap<>();

        for (int i = 0; i < numbersArray.length; i++) {
            int complement = target - numbersArray[i];
            if (targetMap.containsKey(complement)) {
                return new int[]{targetMap.get(complement), i}; // Get the index of the complement
            }
            targetMap.put(numbersArray[i], i); // Store index of the current number
        }

        return new int[]{}; // Return an empty array if no solution found
    }
}
