package recursive;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
   public static List<Integer> targetList=new ArrayList<>();
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,8,8,6};
        int target=6;
        System.out.println("the target element present in the index------"
                +findTarget(array,0,target,array.length));

        List<Integer> outPutList = findTargetList
                (array, 0, target, array.length, targetList);
        System.out.println("the output list is ----------> "+outPutList);

        outPutList=findTargetListV2(array,0,target,array.length);
        System.out.println("the output list is ----------> "+outPutList);
    }


    public static List<Integer> findTargetListV2(int[] array,int index,
                                                 int target,int length){
        List<Integer> targetList = new ArrayList<>();
        if(index==length){
            return targetList;
        }
        if(array[index]==target){
            targetList.add(index);
        }
        targetList.addAll(findTargetListV2(array,index+1,target,length));
        return targetList;
    }

    public static List<Integer> findTargetList(int[] array, int index, int target,
                                      int length, List<Integer> targetList) {
        if (index >= length) { // Base case: end of array
            return targetList;
        }
        if (array[index] == target) {
            targetList.add(index); // Add index if target is found
        }
        return findTargetList(array, index + 1, target, length, targetList); // Recursive call
    }



    public static int findTarget(int[] array, int index, int target, int length) {
        if (index == length - 1 && array[index] == target) {
            return index;
        } else if (array[index] == target) {
            return index;
        } else {
            return findTarget(array, index + 1, target, length);
        }
    }
}
