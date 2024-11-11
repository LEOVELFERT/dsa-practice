package sorting.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
           int[] arr={34,23,12,2,1,4};
//           arr= mergeSort(arr);
//           System.out.println("the sorted array is "+Arrays.toString(arr));

           mergeSortInPlace(arr,0,arr.length);
           System.out.println("the sorted array is "+Arrays.toString(arr));
    }


    public static void mergeSortInPlace(int[] arr, int start, int end) {
        // Base case: if the array is a single element, it's already sorted
        if (end - start <= 1) {
            return;
        }

        // Find the middle index to divide the array
        int mid = (start + end) / 2;

        // Recursively sort the two halves
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        // Merge the sorted halves in-place
        mergeInPlace(arr, start, mid, end);
    }

    // Merge the two sorted halves in place
    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        // Temporary array to store the merged result
        int[] mix = new int[end - start];

        int i = start;   // Pointer for the first subarray
        int j = mid;     // Pointer for the second subarray
        int k = 0;       // Pointer for the merged array

        // Merge the two sorted subarrays
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the first subarray if any
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the second subarray if any
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged result back into the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }


    public static int[] mergeSort(int[] arr){
        int length=arr.length;
        if(length<=1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left= Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,length);

        left=mergeSort(left);
        right=mergeSort(right);

       return merge(left,right);
    }

    public static int[] merge(int[] first,int[] second){
        int i=0;   //first array pointer
        int j=0;   //second array pointer
        int k=0;   //new array pointer

        int firstArrayLength=first.length;
        int secondArrayLength=second.length;

        int[] arr=new int[firstArrayLength+secondArrayLength];

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                arr[k]=first[i];
                i++;
            }else{
                arr[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
        return arr;
    }
}
