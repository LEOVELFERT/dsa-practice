package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        String example="dog cat cat dog";
        String[] split = example.split("\\s+");
        System.out.println(Arrays.toString(split));
        String pattern="abba";
        boolean b = wordPattern(pattern, example);
        System.out.println("the boolean value : "+b);
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words=s.split("\\s+");
        int length=pattern.length();
        if(length!=words.length){
            return false;
        }
        Map<String,Character> map=new HashMap<>();
        for(int i=0;i<length;i++){
            String word=words[i];
            char character=s.charAt(i);
            if(map.containsKey(word)){
                if(map.get(word)!=character){
                    return false;
                }
            }else if(map.containsValue(character)){
                return false;
            }
            map.put(word,character);
        }
        return true;
    }
}
