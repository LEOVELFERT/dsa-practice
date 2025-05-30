package binarysearch;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int[] arr = {78, 56, 45, 34, 23, 16, 13, 8, 6, 5, 4, 2};
        int target=45;
        System.out.println("the target element is=========="+orderAgonisticBs(arr,target));
    }

    static int orderAgonisticBs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
