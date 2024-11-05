package sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,4,3,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        int length=arr.length;
        boolean swapped;

        for(int i=0;i<length-1;i++){
            swapped=false;
            for(int j=0;j<length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        //swapped the elements
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        swapped=true;
                    }
            }
            if(!swapped){
                return arr;
            }
        }
        return arr;
    }
}
