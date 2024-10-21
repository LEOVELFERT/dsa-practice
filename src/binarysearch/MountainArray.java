package binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1, 3, 7, 12,13, 14, 10, 8, 5, 2, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1]){
               //you are in the decreasing part of the array
               end=mid;
           }else{
               start=mid+1;
           }
        }
        return start;//or return end both are pointing the same index
    }
}
