package maths;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        int ans = n & (n - 1);
        boolean isPowerOfTwo = ans == 0 ? true : false;
        System.out.println(isPowerOfTwo);
    }
}
