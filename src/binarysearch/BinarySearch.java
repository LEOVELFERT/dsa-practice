package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8,13,16,23,34,45,56,78};
        int target=56;
        int element=binarySearch(arr,target);
        System.out.println("the binary Search element : "+element);
    }

    //return -1 if element is not there
    //return value if element is present there
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            //int mid=(start+end)/2 it wont work for the all the integer value
            //in worst case if start and end is high integer value then it is possible that the ans will be exceed the
            //the integer limit
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<mid){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;

    }
}
