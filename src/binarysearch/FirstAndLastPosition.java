package binarysearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=problem-list-v2&envId=binary-search
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        searchRange(nums,target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        //searching for the first index of the given target
        int start=searchIndex(nums,target,true);
        //searching for the first indesx of the given target
        int end=searchIndex(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    public static int searchIndex(int[] nums,int target,boolean isStartIndex){
        int start=0;
        int end=nums.length-1;

        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                //potential ans is found so we are moving the pointer towards left hand side if we want to know the first index of the target
                //if want to know the last index of the target we can move the pointer towards the right hand side
                ans=mid;
                if(isStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
