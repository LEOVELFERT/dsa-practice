package streamapi.limit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstTwo {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Gopi","leo","sunday","monday");
        List<String> sortedList = names.stream().limit(2).toList();
        System.out.println(sortedList);
    }
}
