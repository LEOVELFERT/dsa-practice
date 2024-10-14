package binarysearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=binary-search
public class SmallestLetterDemo {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ansElement = nextGreatestLetter(letters, target);
        System.out.println("the next greatest element :" + ansElement);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(target>letters[letters.length-1]){
            return letters[0];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==letters[mid]){
                return letters[mid];
            }
            else if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start];
    }
}
