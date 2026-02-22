package binarysearch.practice;

public class PracticeBinarySearch {
    public static void main(String args[]) {
        int [] array= {-5,1,2,3,4,5,6};
        int target=5;
        int result = binarySearch(array, target);
        System.out.println("the result is "+ result);
    }

    static int binarySearch(int[] array,int target){
        int start=0;
        int end = array.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>array[mid]){
                start=mid+1;
            }else if(target<array[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
