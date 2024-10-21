package twopointers;

public class SubSequence {

    public static void main(String[] args) {
        String firstString = "leovelbert";
        String secondString = "treb";
        System.out.println(isSubsequence(firstString,secondString));
    }

    public static boolean isSubsequence(String s, String t) {
        int ssCounter=0;
        int ssLength=t.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(ssCounter)){
                ssCounter++;
                if(ssCounter==ssLength){
                    return true;
                }
            }
        }
        return false;
    }

}
