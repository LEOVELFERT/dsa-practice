package binarysearch;

public class AgnositcBinarySearch {
    public static void main(String[] args) {
//        int[] arr={2,4,5,6,8,13,16,23,34,45,56,78};
        int[] arr = {78, 56, 45, 34, 23, 16, 13, 8, 6, 5, 4, 2};
        int target=56;
        boolean isAsc=arr[0]<arr[arr.length-1];
        int element=agnosticBinarySearch(arr,target,isAsc);
        System.out.println("the ans element is : "+element);
    }
    public static int agnosticBinarySearch(int[] arr,int target,boolean isAsc){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
