package maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int numberLimit = 20;
        for (int i = 1; i < numberLimit; i++) {
            System.out.println("The numbeer :" + i + "isPrime :" + isPrime(i));
        }
    }

    static boolean isPrime(int number) {
        if (number == 1 && number == 2) {
            return true;
        }
        int c = 2;
        while (c * c <= number) {
            if (number % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
