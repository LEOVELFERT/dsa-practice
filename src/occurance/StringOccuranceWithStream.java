package occurance;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringOccuranceWithStream {
    public static void main(String[] args) {
//        String inputString="gopi annan";
//        char[] charArray = inputString.toCharArray();
//        Map<Character, Long> charCountMap = IntStream.range(0, charArray.length)//converting char array to instream
//                .mapToObj(character -> (char) character)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//      charCountMap.forEach((character,count)->{
//          System.out.println(character+" : "+count);
//      });
String inputString="leo";
        System.out.println(inputString.substring(0,0));
    }
}
