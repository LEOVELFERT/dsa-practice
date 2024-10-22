package binarysearch;

public class MountainArraySearch {
    public static void main(String[] args) {
        int[] nums={1,2,4,5,3,0};
        int n=searchInMountainArray(nums,3);
        System.out.println("The search index is "+n);
    }

    public static int searchInMountainArray(int[] nums,int target) {
        int peakIndex = peakIndexInMountainArray(nums);
        int searchIndex = agnosticBinarySearch(nums, target, 0,
                peakIndex - 1, true);
        return searchIndex==-1?agnosticBinarySearch(nums,target,
                peakIndex+1,nums.length,false):-1;
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in the decreasing part of the array
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;//or return end both are pointing the same index
    }

    public static int agnosticBinarySearch(int[] arr,int target,int start,int end,boolean isAsc){
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
