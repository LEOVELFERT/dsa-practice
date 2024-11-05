package sorting.selectionsort;

import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        int[] arr=new int[]{2,1,-32,-32,23,45,45};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
            int length=arr.length;

            for(int i=0;i<=length-1;i++){
                    int actualMaxIndex=length-1-i;
                    int maxIndex=findMaxIndex(arr,0,actualMaxIndex);
                    swap(arr,actualMaxIndex,maxIndex);
            }

            return arr;
    }

    private static void swap(int[] arr, int index1,int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <=end; i++) { // Include the last element
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


}
