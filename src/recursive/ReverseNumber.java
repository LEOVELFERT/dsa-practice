package recursive;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=12113;
      //  int powerOfTen=getPowerOfTen(number);
        int reverseNumber=reverseTheNumber(number);
        System.out.println("the reverse number is --------------> "+reverseNumber);
    }

    public static int reverseTheNumber(int number) {
        if(number%10==number){
            return number;
        }
       return (number%10)
               *getPowerOfTen(number/10)
               +reverseTheNumber(number/10);
    }

    public static int getPowerOfTen(int number) {
        int numDigits = String.valueOf(number).length(); // Count the number of digits
        return (int) Math.pow(10, numDigits);            // Return 10 raised to the power of the digit count
    }
}
