//https://leetcode.com/problems/climbing-stairs/

package blindly75.climbstairs;

public class ClimbStairsDemo {
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first=1;
        int second=2;
        int total=0;

        for(int i=3;i<=n;i++){
            total=first+second;
            first=second;
            second=total;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("the number of ways to climb the stairs "+climbStairs(5));
    }
}
