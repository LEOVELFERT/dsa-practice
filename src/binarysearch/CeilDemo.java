package binarysearch;

//find the element from the given array which should be greter than or equal to target element
//it should be first minimum value like
// arr->{1,2,3,5,6,45} target=4 expected output-> 5 so out put index value ->3
public class CeilDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 13, 16, 23, 34, 45, 56, 78};
        int target = 56;
        int element = binarySearch(arr, target);
        System.out.println("the binary Search element : " + element);
    }

    //find the smallest number i.e ans>=target
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target >= arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            //int mid=(start+end)/2 it won't work for the all the integer value
            //in worst case if start and end is high integer value then it is possible that the ans will be exceed the
            //the integer limit
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}
