package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUtils {
    public static void main(String[] args) throws IOException {
        //reverse the string
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the string value");
//        String inputString = reader.readLine();
//        String reversedString=reverseTheString(inputString);
//        System.out.println("the reversed string is :"+reversedString);
//
        //check two string are equal in java
//        String firsString="leo";
//        String secondString="leo";
//        boolean stringEquals = firsString.equals(secondString);
//        if(stringEquals){
//            System.out.println("the two strings are equal ");
//        }else{
//            System.out.println("the two strings are not equal");
//        }

        //convert string into the integer
//        String numberString="1";
//        System.out.println("the number stirng after conversion"+Integer.parseInt(numberString));

        //check the string pallindrome or not
        String inputPallindromString="amm";
        boolean pallindromFlag=isPallindrome(inputPallindromString);
        if(pallindromFlag){
            System.out.println("the given string is pallindrome");
        }else{
            System.out.println("the given stirng is not pallindrome");
        }

    }

    public static boolean isPallindrome(String inputPallindromString) {
        char[] inputCharArray = inputPallindromString.toCharArray();
        for(int i=0;i<inputCharArray.length;i++){
            if(inputCharArray[i]!=inputCharArray[inputCharArray.length-i-1]){
                return false;
            }
        }
        return true;
    }

    private static String reverseTheString(String inputString) {
        char[] charArray = inputString.toCharArray();
        StringBuilder builder=new StringBuilder();
        for(int i=charArray.length-1;i>=0;i--){
            builder.append(charArray[i]);
        }
        return builder.toString();
    }

}
