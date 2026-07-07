package maths;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        factor(n);
    }

    static void factor(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                list.add(n / i);
            }
        }
        int listSize = list.size();
        for (int i = listSize - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
