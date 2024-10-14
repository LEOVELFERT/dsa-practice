package binarysearch;
//find the target element in the sorted infinite arry
public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int ans=findAns(nums,target);
        System.out.println("the out put for the infinite array : "+ans);
    }

    public static int findAns(int[] nums,int target){
        int start=0;
        int end=1;

        while(target>nums[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(nums,target,start,end);
    }

    public static int binarySearch(int[] arr,int target,int start,int end){
//        int start=0;
//        int end =arr.length-1;
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
