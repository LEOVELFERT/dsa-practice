package stringpractice;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String leo="leovelbert";
        int indexOfLeo = leo.indexOf("leo");
        System.out.println(indexOfLeo);

        String text = "   Hello World!   ";  // Multiple spaces at the start and end
        String strippedText = text.strip();
        System.out.println("Before: '" + text + "'");
        System.out.println("After: '" + strippedText + "'");

        String[] unsortedArry={"flower","flow","flight"};
        Arrays.sort(unsortedArry);
        System.out.println("sorted Array :"+Arrays.toString(unsortedArry));


    }
}
