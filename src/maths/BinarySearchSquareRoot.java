package maths;

public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int number = 40;
        int precision=3;
        System.out.println("The square root of " + number + " is: " + squareRoot(number,precision));
    }

    static double squareRoot(int number, int precison) {
        int start = 1;
        int end = number - 1;
        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = mid * mid;
            if (sum == number) {
                return mid;
            } else if (sum > number) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            float incr = 0.1f;
            for (int i = 0; i < precison; i++) {
                while (root * root < number) {
                    root += incr;
                }
                root -= incr;
                incr /= 10;
            }

        }
        return root;
    }
}
