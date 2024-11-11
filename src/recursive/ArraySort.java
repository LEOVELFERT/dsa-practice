package recursive;

public class ArraySort {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,8,6};
        System.out.println(isArraySorted(array,0));
    }

    public static boolean isArraySorted(int[] array,int index){
        if(index==array.length-1){
            return true;
        }
        return array[index]<array[index+1]
                && isArraySorted(array,index+1);
    }
}
