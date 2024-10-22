package binarysearch;

public class RBS {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 1, 2};
        int start = 0;
        int end = nums.length - 1;
        int target = 2;

        // Find the pivot element

        int pivot = findPivot(nums, start, end);

        // If pivot is -1, the array is not rotated, perform normal binary search
        if (pivot == -1) {
            System.out.println("The target element index is " + binarySearch(nums, target, start, end));
        } else {
            // If target is found at the pivot
            if (nums[pivot] == target) {
                System.out.println("The target element index is " + pivot);
            } else {
                // Search in the two halves
                int searchIndex = binarySearch(nums, target, 0, pivot - 1);
                if (searchIndex == -1) {
                    searchIndex = binarySearch(nums, target, pivot + 1, end);
                }
                System.out.println("The target element index is " + searchIndex);
            }
        }
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = findPivot(nums, start, end);

        // If pivot is -1, the array is not rotated, perform normal binary search
        if (pivot == -1) {
           return binarySearch(nums, target, start, end);
        } else {
            // If target is found at the pivot
            if (nums[pivot] == target) {
               return pivot;
            } else {
                // Search in the two halves
                int searchIndex = binarySearch(nums, target, 0, pivot - 1);
                if (searchIndex == -1) {
                    searchIndex = binarySearch(nums, target, pivot + 1, end);
                }
                return searchIndex;
            }

        }
    }

    // Find pivot in rotated sorted array
    public static int findPivot(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {  // Move towards the unsorted part
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;  // Pivot not found, array is not rotated
    }

    // Regular binary search
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {  // Fixed the comparison here
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;  // Target not found
    }
}
