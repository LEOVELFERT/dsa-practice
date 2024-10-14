package largest;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestDemo {
    public static void main(String[] args) {
        int[] inputArray={2,4,5,7,8,9};
        int secondLargestElement=getSecondLargest(inputArray);
        System.out.println("the second largest element is "+secondLargestElement);

        secondLargestElement=getSecondLargestByStram(inputArray);
        System.out.println("the second largest by using stream "+secondLargestElement);
    }

    private static int getSecondLargestByStram(int[] inputArray) {
        return Arrays.stream(inputArray).boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();
    }

    private static int getSecondLargest(int[] inputArray) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<inputArray.length;i++){
            if (inputArray[i] > largest) {
                secondLargest=largest;
largest=inputArray[i];
            } else if (inputArray[i]<largest&&inputArray[i]>secondLargest) {
                secondLargest=inputArray[i];
            }
        }
        return secondLargest;
    }
}
