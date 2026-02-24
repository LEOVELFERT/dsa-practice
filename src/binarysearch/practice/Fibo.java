package binarysearch.practice;

public class Fibo {
    public static void main(String[] args) {
        int ans=fibo(7);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        //this entire thing is called as the tail recursion.
        return fibo(n-1)+fibo(n-2);
    }
}
