package practice;

public class PracticeClass {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8,13,16,23,34,45,56,78};
        int target=56;
//        practiceBinarySearch(arr,target);
        System.out.println("target element"+practiceBinarySearch(arr,target));

    }

    private static int practiceBinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
}
