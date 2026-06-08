package maths;
//complexity log n
public class NumberOfDigit {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        int numbersOfDigits=(int)(Math.log(a)/Math.log(b))+1;
        System.out.println("The number of Digits present in the number "+numbersOfDigits);
    }
}
