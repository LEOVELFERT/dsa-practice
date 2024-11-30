package permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {
        String inputString="";

        List<String> permutations=new ArrayList<>();
        permutation(inputString,"",permutations);

        permutations.forEach(System.out::println);

    }

    public static void permutation(String str,String prefix,List<String> permutations){
        if(str.isEmpty()){
            permutations.add(prefix);
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String remaining=str.substring(0,i)+str.substring(i+1);
            permutation(remaining,prefix+current,permutations);
        }
    }
}
