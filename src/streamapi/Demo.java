package streamapi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        String inputString = "leovelbert";
        char[] convertedString = inputString.toCharArray();
        IntStream.range(0, convertedString.length)
                .mapToObj(i -> convertedString[i])
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
    }
}
