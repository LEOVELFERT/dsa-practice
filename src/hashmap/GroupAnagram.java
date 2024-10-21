package hashmap;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList();
        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted string as key and list of anagrams as value
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strs) {
            // Convert the string to a character array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding anagram group
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(anagramMap.values());
    }
}