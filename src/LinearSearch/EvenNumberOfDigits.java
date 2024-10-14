package LinearSearch;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {23, 34, 3, 4, 5, 3456};
        int ans = findEvenNumOfDigits(nums);
        if (ans == -1) {
            System.out.println("given array length should be greater than 1");
        }
        System.out.println("Even numbs of digits for the given Array : " + ans);
    }

    public static int findEvenNumOfDigits(int[] nums) {
        //if array lenghth is lower than 2 return -1
        if (nums.length < 1) {
            return -1;
        }
        //Iterating the array and find the count of the digits
        // if digits is prime number we can return the count of the prime number
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if(findDigits(nums[i])%2==0){
               count++;
           }
        }
        return count;
    }

    public static int findDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
