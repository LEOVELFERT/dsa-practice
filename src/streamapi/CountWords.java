package streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountWords {
    public static void main(String[] args) {
        String inputString="input String";
        String replacedString = inputString.replace(" ", "");
        char[] charArray = replacedString.toCharArray();
        Map<Character, Long> countMap = IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[i])
                .filter(character -> !Character.isWhitespace(character))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(countMap);
    }
}
