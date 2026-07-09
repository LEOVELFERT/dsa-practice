package maths;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(9, 18));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        //formula lcm=(a*b)/gcd(a,b);
        //a*b= gcd(a,b)* lcm(a,b)
        return a * b / gcd(a, b);
    }
}
