package recursion;

public class Resursive {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("The Recursive Function Strats");
        int ans=recursive(2);
        System.out.println("The Recursive Number is : "+ans);
    }

    static int recursive(int recursiveNumber){
        if(recursiveNumber==1 || recursiveNumber==0){
            return 1;
        }
        return recursiveNumber * recursive(recursiveNumber-1);
    }
}
