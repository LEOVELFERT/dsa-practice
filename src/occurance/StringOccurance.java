package occurance;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        String inputString="leovelbert";
        char[] charArray = inputString.toCharArray();
        Map<Character,Integer> occuranceMap=new HashMap<>();
        for(char inputChar:charArray){
            if(occuranceMap.containsKey(inputChar)){
                int currentCount = occuranceMap.get(inputChar);
                occuranceMap.put(inputChar, currentCount + 1);
            }else{
                occuranceMap.put(inputChar,1);
            }
        }

        System.out.println(occuranceMap);
    }
}
