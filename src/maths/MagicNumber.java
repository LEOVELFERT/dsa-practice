package maths;

public class MagicNumber {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("The Magic Number is " + magicNumber(number));
    }

    private static int magicNumber(int number) {
        int ans = 0;
        int base = 5;
        while (number > 0) {
            int last = number & 1;
            number = number >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
