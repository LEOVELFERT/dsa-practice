package leetcode;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        merge(new int[]{1, 3, 5, 0, 0, 0},3, new int[]{2, 5, 6},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        System.out.println("intial i value"+i);
        System.out.println("initial j value"+j);
        System.out.println("intial k value"+k);

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
            System.out.println(Arrays.toString(nums1));
            System.out.println("i value"+i);
            System.out.println("j value"+j);
            System.out.println("k value"+k);
            System.out.println(Arrays.toString(nums1));
            System.out.println(Arrays.toString(nums2));
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

}
