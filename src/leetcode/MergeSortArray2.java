package leetcode;

import java.util.Arrays;

public class MergeSortArray2 {
    public static void main(String[] args) {
        merge(new int[]{1, 3, 5, 0, 0, 0},3, new int[]{2, 5, 6},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[k];
                k++;
            }
        }
        System.out.println("before sortting");
        Arrays.stream(nums1).forEach(System.out::println);
        bubbleSort(nums1);
        System.out.println("before sortting");
        Arrays.stream(nums1).forEach(System.out::println);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }


            if (!swapped) {
                break;
            }
        }
    }
}
