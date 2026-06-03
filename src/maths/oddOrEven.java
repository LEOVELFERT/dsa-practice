package maths;

public class oddOrEven {
    public static void main(String[] args) {
        int number=55;
        System.out.println("Is the number is Odd "+ isOdd(number));
    }

    private static boolean isOdd(int number) {
        return (number&1)==1;
    }
}
