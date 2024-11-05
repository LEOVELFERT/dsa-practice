package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int length=arr.length;
        //sort the array by using insertion sort
        insertionSort(arr,length);

        //print the array
        System.out.println("array after sorting : "+ Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int n) {
        for(int i=0;i<n-1;i++){   //which means that it will run n-2
                for(int j=i+1;j>0;j--){     //it will run j is greter than zero here
                     if(arr[j]<arr[j-1]){                   //we are decrement the j
                            swap(arr,j,j-1);
                     }else{
                            break;           //so previous element is already small which means
                                                //if previous elment is small all the array is sorte
                                                // so no need to decrement the j pointer
                     }
                }
        }
    }


    private static void swap(int[] arr, int index1,int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
